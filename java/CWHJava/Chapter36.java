import java.util.*; 
import java.util.Random;      // i know this is not needed but i wanted to see if Random is a utility or not; 

public class Chapter36 {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in); 

    // // this one's about OOPS finally we've arrived there; 
    // Employee tanmay = new Employee(); 
    // tanmay.id = 77; 
    // tanmay.name = "samurai"; 
    // tanmay.salary = 2; 
    // tanmay.printDetails(); 
    // System.out.println("salary of samurai: "+ tanmay.getSalary());
    //
    // // doing the same thing because uhh yeah tutorial says it: 
    // Employee john = new Employee(); 
    // john.id = 45; 
    // john.name = "john-merc"; 
    // john.salary = 21; 
    // john.printDetails(); 
    // System.out.println("salary of john-merc: "+ john.getSalary());
    
    
    // // practice set chapter 8: 
    // // #1. 
    // System.out.println("problem #1 : Employee class");
    // Employee kristen = new Employee(); 
    // kristen.name = "kristenCAS"; 
    // kristen.salary = 3000000; 
    // System.out.println("employee name: " + kristen.getName());
    // System.out.println(kristen.name + "'s salary: " + kristen.getSalary());
    // kristen.setName();
    // System.out.println("checking the name just in case: "+ kristen.getName());
    // kristen.setName1("newDayNewMe"); 
    // System.out.println("new name: " + kristen.getName());

    // // #2. 
    // System.out.println("problem #2 : Cellphone class");
    // Cellphone phone1 = new Cellphone(); 
    // phone1.setName(); 
    // phone1.ring(); 
    // phone1.vibrate();
    // phone1.call();

    // // #3. 
    // System.out.println("problem #3 : class Square which can calculate area, perimeter, etc of a square ofc");
    // Square s = new Square(); 
    // s.initialize(); 
    // s.area(); 
    // s.perimeter();

    // // #4. 
    //   System.out.println("problem #4 : same class like square but with rectangle");
    //   Rectangle r = new Rectangle(); 
    //   r.initialize(); 
    //   r.area(); 
    //   r.perimeter(); 

    // // #5. 
    // System.out.println("practice #5 : creating a character class for Tommy Vicetti for Rockstar Games lol: ");
    // TommyVicetti p1 = new TommyVicetti(); 
    // p1.hit(); 
    // p1.fire();
    // p1.run(); 
    


    // // access modifiers | constructors | getters and setters and i guess more idk 
    // MyEmployee e0 = new MyEmployee(); 
    // e0.setName("bhendi");
    // e0.setId(97);
    // System.out.println("output after getName  : " + e0.getName());
    // System.out.println("output after getId    : " + e0.getId());

    // // constructors and constructor overloading:
    // Imagination one = new Imagination("warmth", "calmness", "peace");
    // one.printIdeas(); 

    // // making a game of guessing the number and giving clues while searching: 
    // guessNum n1 = new guessNum(); 
    // n1.game(); 


  }
}

// // we're not using access modifiers like public here because the tutorial is gonna teach that a little later in tutorial; 
// class Employee {
//   int id;       // these are attributes; 
//   String name; 
//   int salary; 
//
//   public void printDetails() {      // these are methods: 
//     System.out.println("employee id: "+ id);
//     System.out.println("name of the employee: "+ name);
//   }
//
//   public int getSalary() {
//     return salary;
//   }
// };


// // #1. create a class Employee with following properties: 
// // --> salary       (property int) 
// // // --> getSalary    (method returning int)
// // --> name         (property String)
// // --> getName      (method returning String)
// // --> setName      (method changing name)
// class Employee {
//   Scanner sc = new Scanner(System.in);
//   int salary;
//   String name;  
//
//   public String getName() {
//     return name; 
//   } 
//   public void setName() {
//     System.out.println("changing the name from " + name);
//     System.out.print("enter new name: ");
//     name = sc.next(); 
//     System.out.println("your new name: " + name);
//   }
//   public int getSalary() {
//     return salary;
//   }
//   // or the setName could be done this way which was shown in video which is fine and working too: 
//   public void setName1(String n) {
//     name = n; 
//   }
// }

// // #2. create a class Cellphone with methods to print: 
// // "ringing...", "vibrating..." etc.
// class Cellphone {
//   Scanner sc = new Scanner(System.in); 
//   String name; 
//   public void setName() {
//     System.out.print("enter your phone's name: ");
//     name = sc.next(); 
//     System.out.println("your phone's name is: " + name);
//   }
//   public void ring() {
//     System.out.println("tr tri...");
//     System.out.println("your phone is ringing right now, answer before the it cuts off");
//     // gotta write anything to fill the requirements
//   }
//   public void vibrate() {
//     System.out.println("bzz bz bzzz");
//     System.out.println("your phone is vibrating. its on vibration mode i guess");
//     // yeah i guess bro 
//   }
//   public void call() {
//     System.out.print("whom do you wanna call? : ");
//     String call = sc.next();
//     System.out.format("calling '%s' from the phone named '%s'\n", call, name);
//   }
// }

// // #3. create a class Square with a method to initialize its side, calculating area, perimeter etc. 
// class Square {
//   Scanner sc = new Scanner(System.in); 

//   float side; 
//   public void initialize() {
//     System.out.print("enter any side of the square: ");
//     side = sc.nextFloat();
//   }
//   public void area() {
//     System.out.println("area of the square: " + side * side);
//   }
//   public void perimeter() {
//     System.out.println("perimeter of the square: " + side * 4);
//   }
// }

// // #4. create class Rectangle & repeat #3's things lol
// class Rectangle {
//   Scanner sc = new Scanner(System.in);
//   float length; 
//   float width; 
//
//   public void initialize() {
//     System.out.print("enter length of your rectangle: ");
//     length = sc.nextFloat(); 
//     System.out.print("enter width of your rectangle: ");
//     width = sc.nextFloat(); 
//     System.out.format("end result : length=%s    width=%s\n", length, width);
//   }
//   public void area() {
//     System.out.println("area of your rectangle: " + length * width);
//   }
//   public void perimeter() {
//     System.out.println("perimeter of your rectangle: " + length*2 + width*2);
//   }
// }

// // #5. create a class TommyVicetti for Rockstar Games capable of hitting(print hitting), running, firing, etc,..
// class TommyVicetti {
//   String name = "Tommy Vicetti";
//
//   public void hit() {
//     System.out.println(name + " is hitting something");
//   }
//   public void fire() {
//     System.out.println(name + " is firing bullets at a civillian");
//   }
//   public void run() {
//     System.out.println(name + " is running");
//   }
// }

// #6 repeat #4 for circle: 
// skipping this one since i wanna move onto learning more things 



// access modifiers & constructors & getters, setters etc from here: 

// class MyEmployee {
//   private int id; 
//   private String name;
//
//   public void setName(String n) {
//     name = n; 
//   }
//   public String getName() {
//     return name; 
//   }
//   public void setId(int i) {
//     id = i;
//   }
//   public int getId() {
//     return id; 
//   }
// } 

// // constructors and constructor overloading: 
// class Imagination {
//   String idea0; 
//   String idea1; 
//   String idea2; 
//   public Imagination() {        // constructors can be overloaded just like methods and other stuff; 
//     idea0 = "searchMore"; 
//     idea1 = "thinkMore"; 
//     idea2 = "youCanDoIt"; 
//   }
//   public Imagination(String i0, String i1, String i2) {
//     idea0 = i0; 
//     idea1 = i1; 
//     idea2 = i2;
//   }
//   public void printIdeas() {
//     System.out.println(idea0);
//     System.out.println(idea1);
//     System.out.println(idea2);
//   }
// }

// this one was quiz question so yeah im ending this file here and gonna continue the practice on new file now :}
// // guessing number game: 
// class guessNum {
//   Random rand = new Random(); 
//   Scanner sc = new Scanner(System.in); 
//   int count = 0; 
//   int guess = rand.nextInt(100) + 1;
//   int in; 
//   public void game() {
//     System.out.println(guess);
//     System.out.print("guess the number from 1-100 : ");
//     in = sc.nextInt();
//     if(guess > in) {
//       System.out.println("try guessing a bigger number");
//       count++;
//       game(); 
//     } else if(guess < in) {
//       System.out.println("try guessing a smaller number");
//       count++;
//       game(); 
//     } else if(guess == in) {
//       System.out.println("its the right number you won :)");
//       count++;
//       System.out.println("total guesses you took : " + count);
//     } else {
//       System.out.println("some error occured running this foolish but useful game i guess :|");
//       game(); 
//     }
//   }
// }
