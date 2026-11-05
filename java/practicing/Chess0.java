import java.util.*; 


public class Chess0 {
  public static void main(String[] args) {
    // System.out.print("choose your rac.. i mean colour: ");
    Board g1 = new Board(); 
    g1.printBoard(); 
  }
}

public class Board {
  int[][] board = new int[8][8];
  public void printBoard() {
    for(int i=0; i<8; i++) {
      for(int j=0; j<8; j++) {
        System.out.format("%d,%d  ", i, j);
      }
      System.out.println();
    }
  }
}

public class King {
  int k = 0; 
}

// we need to put more thoughts into this 
