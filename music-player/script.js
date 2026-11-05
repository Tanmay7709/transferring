const audio = document.getElementById('audio-player');
const fileInput = document.getElementById('mp3-upload');
const playBtn = document.getElementById('play-btn');
const prevBtn = document.getElementById('prev-btn');
const nextBtn = document.getElementById('next-btn');
const shufBtn = document.getElementById('shuf-btn');
const loopBtn = document.getElementById('loop-btn');
const muteBtn = document.getElementById('mute-btn');
const clearBtn = document.getElementById('clear-btn');
const seekBar = document.getElementById('seek-bar');
const volumeBar = document.getElementById('volume-bar');
const volPct = document.getElementById('vol-pct');
const trackTitle = document.getElementById('track-title');
const trackTime = document.getElementById('track-time');
const modeBadge = document.getElementById('mode-badge');
const trackIndexBadge = document.getElementById('track-index-badge');
const statusDot = document.getElementById('status-dot');
const playlistEl = document.getElementById('playlist');
const reelLeft = document.getElementById('reel-left');
const reelRight = document.getElementById('reel-right');

const API_URL = 'http://localhost:8080/api/tracks';

let tracks = [];
let currentIndex = -1;
let isShuffle = false;
let loopMode = 0; // 0 = OFF, 1 = ALL, 2 = ONE

// 1. Fetch tracks from Java Server if running
async function fetchTracksFromBackend() {
  try {
    const res = await fetch(API_URL);
    if (res.ok) {
      const savedTracks = await res.json();
      tracks = savedTracks.map(t => ({
        name: t.title,
        url: `http://localhost:8080/uploads/${encodeURIComponent(t.filename)}`
      }));
      renderPlaylist();
      if (tracks.length > 0) loadTrack(0, false);
    }
  } catch (err) {
    // Works locally if Java server isn't running
  }
}

// 2. Upload .mp3 files
fileInput.addEventListener('change', async (e) => {
  const files = Array.from(e.target.files);
  if (files.length === 0) return;

  for (const file of files) {
    const cleanName = file.name.replace(/\.[^/.]+$/, "");
    const localUrl = URL.createObjectURL(file);

    tracks.push({ name: cleanName, url: localUrl });
    uploadToBackend(file, cleanName);
  }

  renderPlaylist();

  if (currentIndex === -1 && tracks.length > 0) {
    loadTrack(0, true);
  } else {
    updateBadges();
  }

  fileInput.value = '';
});

async function uploadToBackend(file, title) {
  try {
    await fetch(`${API_URL}?title=${encodeURIComponent(title)}&filename=${encodeURIComponent(file.name)}`, {
      method: 'POST',
      body: file
    });
  } catch (err) {
    // Ignore if server offline
  }
}

// 3. Load & Play Track
function loadTrack(index, autoPlay = true) {
  if (index < 0 || index >= tracks.length) return;
  currentIndex = index;
  audio.src = tracks[currentIndex].url;
  trackTitle.textContent = tracks[currentIndex].name;
  updateBadges();
  renderPlaylist();

  if (autoPlay) {
    audio.play();
    updatePlayState(true);
  } else {
    updatePlayState(false);
  }
}

function updatePlayState(isPlaying) {
  playBtn.textContent = isPlaying ? 'PAUSE' : 'PLAY';
  reelLeft.classList.toggle('spinning', isPlaying);
  reelRight.classList.toggle('spinning', isPlaying);
  statusDot.classList.toggle('playing', isPlaying);
}

function updateBadges() {
  const cur = currentIndex >= 0 ? String(currentIndex + 1).padStart(2, '0') : '00';
  const tot = String(tracks.length).padStart(2, '0');
  trackIndexBadge.textContent = `${cur} / ${tot}`;

  const shufText = isShuffle ? 'SHUFFLE' : 'NORMAL';
  const loopLabels = ['LOOP OFF', 'LOOP ALL', 'LOOP ONE'];
  modeBadge.textContent = `${shufText} // ${loopLabels[loopMode]}`;
}

// 4. Transport Controls
playBtn.addEventListener('click', () => {
  if (tracks.length === 0) return;
  if (audio.paused) {
    audio.play();
    updatePlayState(true);
  } else {
    audio.pause();
    updatePlayState(false);
  }
});

prevBtn.addEventListener('click', () => {
  if (tracks.length === 0) return;
  if (audio.currentTime > 3) {
    audio.currentTime = 0;
    return;
  }
  const prevIdx = (currentIndex - 1 + tracks.length) % tracks.length;
  loadTrack(prevIdx, true);
});

nextBtn.addEventListener('click', () => {
  playNextTrack(true);
});

function playNextTrack(manualClick = false) {
  if (tracks.length === 0) return;

  // If Loop ONE is enabled and song ended naturally
  if (!manualClick && loopMode === 2) {
    audio.currentTime = 0;
    audio.play();
    return;
  }

  // If Shuffle is enabled
  if (isShuffle && tracks.length > 1) {
    let randIdx = currentIndex;
    while (randIdx === currentIndex) {
      randIdx = Math.floor(Math.random() * tracks.length);
    }
    loadTrack(randIdx, true);
    return;
  }

  // Normal sequential advance
  const isLast = currentIndex === tracks.length - 1;
  if (isLast && !manualClick && loopMode === 0) {
    updatePlayState(false);
    return;
  }

  const nextIdx = (currentIndex + 1) % tracks.length;
  loadTrack(nextIdx, true);
}

// 5. Shuffle & Loop Buttons
shufBtn.addEventListener('click', () => {
  isShuffle = !isShuffle;
  shufBtn.classList.toggle('active-shuf', isShuffle);
  updateBadges();
});

loopBtn.addEventListener('click', () => {
  loopMode = (loopMode + 1) % 3;
  const labels = ['LOOP: OFF', 'LOOP: ALL', 'LOOP: ONE'];
  loopBtn.textContent = labels[loopMode];
  loopBtn.classList.toggle('active-loop', loopMode > 0);
  updateBadges();
});

// 6. Seek, Volume, Mute & Clear
audio.addEventListener('timeupdate', () => {
  if (!isNaN(audio.duration)) {
    seekBar.value = (audio.currentTime / audio.duration) * 100;
    trackTime.textContent = `${formatTime(audio.currentTime)} / ${formatTime(audio.duration)}`;
  }
});

seekBar.addEventListener('input', () => {
  if (!isNaN(audio.duration)) {
    audio.currentTime = (seekBar.value / 100) * audio.duration;
  }
});

volumeBar.addEventListener('input', () => {
  audio.volume = volumeBar.value;
  audio.muted = false;
  muteBtn.textContent = 'VOL';
  volPct.textContent = `${Math.round(volumeBar.value * 100)}%`;
});

muteBtn.addEventListener('click', () => {
  audio.muted = !audio.muted;
  muteBtn.textContent = audio.muted ? 'MUTE' : 'VOL';
  volPct.textContent = audio.muted ? '0%' : `${Math.round(volumeBar.value * 100)}%`;
});

clearBtn.addEventListener('click', () => {
  audio.pause();
  audio.src = '';
  tracks = [];
  currentIndex = -1;
  trackTitle.textContent = 'NO TAPE INSERTED';
  trackTime.textContent = '00:00 / 00:00';
  seekBar.value = 0;
  updatePlayState(false);
  updateBadges();
  renderPlaylist();
});

audio.addEventListener('ended', () => {
  playNextTrack(false);
});

function formatTime(sec) {
  const m = Math.floor(sec / 60).toString().padStart(2, '0');
  const s = Math.floor(sec % 60).toString().padStart(2, '0');
  return `${m}:${s}`;
}

// 7. Render Playlist with individual delete button
function renderPlaylist() {
  playlistEl.innerHTML = '';
  if (tracks.length === 0) {
    playlistEl.innerHTML = '<li class="empty-msg">No tracks loaded. Click "+ UPLOAD .MP3" to add music from your files.</li>';
    return;
  }

  tracks.forEach((track, idx) => {
    const li = document.createElement('li');
    if (idx === currentIndex) li.classList.add('active');

    const titleSpan = document.createElement('span');
    titleSpan.textContent = `${String(idx + 1).padStart(2, '0')}. ${track.name}`;
    titleSpan.style.flex = '1';
    titleSpan.addEventListener('click', () => loadTrack(idx, true));

    const delBtn = document.createElement('button');
    delBtn.className = 'track-remove';
    delBtn.textContent = '×';
    delBtn.title = 'Remove track';
    delBtn.addEventListener('click', (e) => {
      e.stopPropagation();
      removeTrack(idx);
    });

    li.appendChild(titleSpan);
    li.appendChild(delBtn);
    playlistEl.appendChild(li);
  });
}

function removeTrack(idx) {
  tracks.splice(idx, 1);
  if (tracks.length === 0) {
    clearBtn.click();
    return;
  }
  if (idx === currentIndex) {
    currentIndex = idx % tracks.length;
    loadTrack(currentIndex, !audio.paused);
  } else if (idx < currentIndex) {
    currentIndex--;
  }
  updateBadges();
  renderPlaylist();
}

fetchTracksFromBackend();