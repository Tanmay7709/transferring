import java.util.*; 

public class Chapter20 {
  public static void main(String[] args) {
    // creating rock paper scissors and other loops with arrays and more
    Scanner sc = new Scanner(System.in); 
    Random rnd = new Random(); 

    // // rock paper scissors game 
    // int rng = rnd.nextInt(3);
    // System.out.println("enter a number for picking a side in rock paper scissors: ");
    // System.out.println("1 for rock");
    // System.out.println("2 for paper");
    // System.out.println("3 for scissors");
    // System.out.print("your choice : ");
    // int ch = sc.nextInt(); 
    // ch--; 
    // String player1, machineGuy;
    // if(ch == 0) {
    //   player1 = "rock"; 
    // } else if(ch == 1) {
    //   player1 = "paper";
    // } else if(ch == 2) {
    //   player1 = "scissors";
    // } else {
    //   player1 = "problemIzHere";
    // }
    // if(rng == 0) {
    //   machineGuy = "rock"; 
    // } else if(rng == 1) {
    //   machineGuy = "paper"; 
    // } else if(rng == 2) {
    //   machineGuy = "scissors"; 
    // } else {
    //   machineGuy = "erorIzHere";
    // }
    // if(rng == ch) {
    //   System.out.println("you chose : " + player1);
    //   System.out.println("your opponent chose : " + machineGuy);
    //   System.out.println("its a tie");
    // } else if(ch == 0 && rng == 2 || ch == 1 && rng == 0 || ch == 2 && rng == 1) {
    //   System.out.println("you chose : " + player1);
    //   System.out.println("your opponent chose : " + machineGuy);
    //   System.out.println("you won against a smol vulnarable machine are you HAPPY NOW");
    // } else if(ch == 0 && rng == 1 || ch == 1 && rng == 2 || ch == 2 && rng == 0) {
    //   System.out.println("you chose : " + player1);
    //   System.out.println("your opponent chose : " + machineGuy);
    //   System.out.println("you lost lol skills issue tbh");
    // } else {
    //   System.out.println("you chose : " + player1);
    //   System.out.println("your opponent chose : " + machineGuy);
    //   System.out.println("some error came up... must be you who caused it by being stupid in the input section ;P");
    // }


    // // while loops 
    // int i = 1;
    // while(i<=9) {
    //   System.out.println(i);
    //   i++;
    // }
    
    // // do while loops 
    // int i = 1; 
    // do{
    //   System.out.println(i);
    //   i++;
    // } while(i<=9);
    // // this loop needs stopping point or it would just become an infinite loop until the while conditions are satisfied; it runs indefinetely until while condition doesnt get true; 

    // // break and continue in loops 
    // for(int i=0; i<7; i++) {      if(i == 1) {
    //     System.out.println("we're skipping this number");
    //     continue; 
    //   } else if(i == 5) {
    //     System.out.println("some conditions are met so we're ending this loop now");
    //     break; 
    //   } else {
    //     System.out.println(i);
    //     System.out.println("the loop is running");
    //   }
    // }


    // // arrays 
    // // definition : array is a collection of similar types of data
    // String[] stuff = new String[5];
    // for(int i=0; i<stuff.length; i++) { // when getting array's length we dont need to add () symbol for some reason and only then it works neatly; 
    //   System.out.print("enter any 5 words that you want : ");
    //   stuff[i] = sc.next();
    // }
    // System.out.println("\nthings you entered in order");
    // for(int i=0; i<stuff.length; i++) {
    //   System.out.println((i+1) + " : " + stuff[i]);
    // }
    

    // just 2d and 3d arrays not much so yeah try more different things 


    // practice set no 5
    
    // Q1 : write a program to print the following pattern (stars getting from n to 1 showing a triangle)
    // System.out.print("enter a num : ");
    // int n = sc.nextInt(); 
    // for(int i=n; i>0; i--) {
    //   for(int j=0; j<i; j++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // Q2 : write a program to sum first n even numbers using a while loop 
    // System.out.print("enter a till the counting of even numbers will go: ");
    // int n = sc.nextInt();
    // int i=0, c=0;
    // while(i <= n) {
    //   if(i % 2 == 0) {
    //     c = c + i; 
    //   }
    //   i++;
    // }
    // System.out.println("total sum of all even numbers : " + c);
    
    // Q3 : print the given number's table 
    // System.out.print("enter a number to print its table: ");
    // int n = sc.nextInt(); 
    // for(int i=1; i<=10; i++) {
    //   System.out.println(n + " * " +  i + " = " + (n*i)); 
    // }

    // Q4 : print the given number's table but in reverse order
    // System.out.print("enter a number to print its table(reverse): ");
    // int n = sc.nextInt(); 
    // for(int i=10; i>=1; i--) {
    //   System.out.println(n + " * " +  i + " = " + (n*i)); 
    // }

    // Q5 : write a program to find the factorial of a given number using for loops 
    // System.out.print("enter a number for getting its factorial : ");
    // int f = sc.nextInt(); 
    // int a = 1;
    // if(f > 0) {
    //   for(int i=f; i>=1; i--) {
    //   a = a * i;
    //   }
    //   System.out.println("factorial of " + f + " : " + a);
    // } else {
    //   System.out.println("enter a number greater then 0");
    // }
    
    // Q6 : repeat the question 5 but with a while loop 
    // System.out.print("enter a number to get its factorial : ");
    // int f = sc.nextInt(); 
    // int a = 1, i = f;
    // while(i > 0) {
    //   a = a * i; 
    //   i--; 
    // }
    // if(f <= 0) {
    //   System.out.println("enter a positive number greater than 1 to get factorial");
    // } else {
    //   System.out.println("factorial of " + f + " : " + a);
    // }

    // Q7 : repeat question1 using for/while loop 
    // System.out.print("enter some amount for stars: ");
    // int n = sc.nextInt();
    // while(n > 0) {
    //   int i = n; 
    //   while(i > 0) {
    //     System.out.print("* ");
    //     i--;
    //   }
    //   n--; 
    //   System.out.println();
    // }
    
    // Q8 : what can be done using one type of loop can also be done using the other two types of loops = true or false; 
    // ans : true; 

    // Q9 : write a program to calculate the sum of the numbers occuring in the nultiplication table of 8; 
    // System.out.print("sum of all the numbers occuring in the table of : ");
    // int n = sc.nextInt(); 
    // int x = 0; 
    // for(int i=1; i<11; i++) {
    //   int y = n * i;
    //   x = x + y;
    // }
    // System.out.println("sum of all numbers occuring in the table of " + n + " : " + x);

    // Q10 : a do-while loop is executed: 
    // a : at least one; 
    // b : at least twice; 
    // c : at most once; 
    // ans : a 
    
    // Q11 : repeat problem 2 using for loop 
    // System.out.print("count all even numbers till : ");
    // int n = sc.nextInt(); 
    // int a = 0; 
    // for(int i=0; i<=n; i++) {
    //   if(i % 2 == 0) {
    //     a = a + i; 
    //   }
    // }
    // System.out.println("count of all even numbers from 0 to " + n + " : " + a);



    // i think now its all done now next file hehe; 
  }
}
