import java.util.*;

public class Main {
    public static void main(String[] args) {
    // variables lol 
    // String name = "bhendi";
    // int a = 10; 
    // int b = 25;
    // int sum = a + b; 
    // System.out.print("this will be the sum of a + b: ");
    // System.out.println(sum);

    // int a = 10; 
    // int b = 5; 
    // int mult = a * b; 
    // int minus = a - b;
    // int ans = mult / minus;
    // System.out.println("this is the answer for 10*5/10-5: ");
    // System.out.println(ans);


    // taking input 
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // System.out.println(name);

    // Scanner work = new Scanner(System.in);
    // System.out.print("Enter something pleaseeee: ");
    // String something = work.nextLine();
    // System.out.println("the thing that i entered: " + something);
    // it actually worked yess

    // adding getting 2 numbers from input and printing their sum 
    // Scanner one = new Scanner(System.in); 
    // System.out.print("Enter a number: ");
    // int first = one.nextInt();
    // Scanner two = new Scanner(System.in); 
    // System.out.print("Enter another number: ");
    // int second = one.nextInt();
    // int sum = first + second;
    // System.out.println("this is the sum of those two numbers that you gave");
    // System.out.println("sum = " + sum);
    // done this one too lol too ez lol (its just basics what am i even bragging about)



    // conditional statements in java : if/else , else if , switch , break
    // taking input from user and printing output according to that input 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter your age: ");
    // int age = sc.nextInt(); 
    // if(age >= 18) {
    //     System.out.println("you are an adult i guess...");
    // } else {
    //     System.out.println("you might not be an adult...");
    // }

    // doing even and odd 
    // Scanner sc = new Scanner(System.in);
    // System.out.print("enter a number: ");
    // int num = sc.nextInt(); 
    // if(num % 2 == 0) {
    //     System.out.println("the number you entered(" + num + ") is : Even");
    // } else {
    //     System.out.println("the number you entered(" + num + ") is : Odd");
    // }

    // just read and figure it out. i cant explain this one its too long to explain
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("set value for variable 'a': ");
    // int a = sc.nextInt(); 
    // System.out.print("set value for variable 'b': ");
    // int b = sc.nextInt(); 
    // if(a == b) {
    //     System.out.println("a(" + a + ") is equal to b(" + b + ")");
    // } else if(a > b) {
    //     System.out.println("a(" + a + ") is greater than b(" + b + ")");
    // } else if(a < b){
    //     System.out.println("a(" + a + ") is lesser than b(" + b + ")");
    // } else {
    //     System.out.println("there seems to eb some problem in this, because a and b have no differences nor similarities in them? how can this be? so these are just a and b below this statement:");
    //     System.out.println("this is variable 'a': " + a);
    //     System.out.println("this is variable 'b': " + b);
    // }

    // switch here: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("press 1 for english");
    // System.out.println("press 2 for hindi");
    // System.out.println("press 3 for marathi");
    // System.out.print("this will be a button someday: ");
    // int button = sc.nextInt(); 
    // if(button == 1) {
    //     System.out.println("lady fingers");
    // } else if(button == 2) {
    //     System.out.println("bhindi");
    // } else if(button == 3) {
    //     System.out.println("bhendi");
    // } else {
    //     System.out.println("you really should've followed the orders man...");
    // }
    // the tutorial just said to do this way first
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("press 1 for english");
    // System.out.println("press 2 for hindi");
    // System.out.println("press 3 for marathi");
    // System.out.print("this will be a button someday: ");
    // int button = sc.nextInt(); 
    // switch(button) {
    //     case 1: 
    //         System.out.println("lady fingers");
    //         break; 
    //     case 2: 
    //         System.out.println("bhindi");
    //         break; 
    //     case 3: 
    //         System.out.println("bhindi");
    //         break; 
    //     default: 
    //         System.out.println("nope you pressed the wrong button fool");
    // }
    
    // making a calculator from switch 
    // System.out.println("----- CALCULATOR(smol) -----");
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter first number: ");
    // int num1 = sc.nextInt(); 
    // System.out.print("enter first number: ");
    // int num2 = sc.nextInt(); 
    // System.out.println("press 1 for addition");
    // System.out.println("press 2 for subtraction");
    // System.out.println("press 3 for multiplication");
    // System.out.println("press 4 for division");
    // System.out.print("Input here : ");
    // int here = sc.nextInt(); 
    // switch(here) {
    //     case 1:
    //         System.out.println("answer of addition : " + (num1 + num2));
    //         break; 
    //     case 2: 
    //         System.out.println("answer of subtraction : " + (num1 - num2));
    //         break; 
    //     case 3: 
    //         System.out.println("answer of multiplication : " + (num1 * num2));
    //         break; 
    //     case 4:
    //         System.out.println("answer of division : " + (num1 / num2));
    //         break; 
    //     default: 
    //         System.out.println("wrong input bruh try again");
    // }



    // loops : for / while / do while
    // for(int counter = 0; counter < 5; counter = counter + 1) {
    //     System.out.println("printing : " + counter);
    // }

    // print the numbers from 0 to 10 
    // for(int num = 0; num <= 10; num++) {
    //     System.out.println(num);
    // }

    // writing same code with while loop 
    // int i = 0; 
    // while(i <= 10) {
    //     System.out.println(i);
    //     i++;
    // }

    // writing same thing with do while loop 
    // int i = 0; 
    // do{
    //     System.out.println(i);
    //     i++;
    // }while(i <= 10);
    // doing same thing but with unmet conditions in do while loop 
    // int j = 21; 
    // do{
    //     System.out.println(j);
    //     j++;
    // }while(j <= 19);a

    // printing the sum of first n natural numbers;
    // Scanner sc = new Scanner(System.in);
    // int j = 0; 
    // System.out.println("printing total natural numbers till the number 'n' which you would give");
    // System.out.print("gib: ");
    // int num = sc.nextInt(); 
    // for(int i = 1; i <= num; i++) {
    //     j = j + i;
    // }
    // System.out.println("the total sum till number n(which u gave as input) is : " + j); 
    // i did this but instead of using j as 0 i did as 1 and for 'i' i used 2 but the solution was right in both ways 

    // print a number's table given as input from the user using loops
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter a number to print its table: ");
    // int num = sc.nextInt(); 
    // System.out.println(num + "'s table: ");
    // for(int i = 1; i <= 10; i++) {
    //     System.out.println(num + " x " + i + " = " +num * i);
    // }



    // patterns / learning nested loops : 
    // print the pattern (the pattern is 5 asterixs in rectangle shape 4x5)
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("Enter a symbol(example: *) : ");
    // char sym = sc.next().charAt(0);
    // System.out.print("Enter number of rows: ");
    // int row = sc.nextInt(); 
    // System.out.print("enter number of columns: ");
    // int col = sc.nextInt(); 
    // for(int i = 0; i < row; i++) {
    //     for(int j = 0; j < col; j++) {
    //         System.out.print(sym + " ");
    //     }
    //     System.out.println();
    // }

    // making a hollow rectangle 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("which symbol should be used for a hollow shape? : ");
    // char sym = sc.next().charAt(0);
    // System.out.print("Enter number of rows: ");
    // int row = sc.nextInt(); 
    // System.out.print("enter number of columns: ");
    // int col = sc.nextInt(); 
    // for(int i = 1; i <= row; i++) {
    //     for(int j = 1; j <= col; j++) {
    //         // applying a condition that would check if the indexes are either start/end, and if not then ignoring them
    //         if(i == 1 || j == 1 || i == row || j == col) {
    //             System.out.print(sym + " ");
    //         } else {
    //             System.out.print("  ");
    //         }
    //     }
    //         System.out.println();
    // }

    // making a half pyramid : 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("how many rows for the half pyramid : ");
    // char sym = sc.next().charAt(0);
    // System.out.print("Enter number of rows: ");
    // int row = sc.nextInt(); 
    // for(int i = 1; i <= row; i++) {             // this same thing can be done with 0 as index but im just using 1 here:
    //     for(int j = 1; j <= i; j++) {
    //         System.out.print(sym + " ");
    //     }
    //     System.out.println();
    // }

    // print the inverted pyramid : 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("how many rows for the (inverted)half pyramid : ");
    // char sym = sc.next().charAt(0);
    // System.out.print("Enter number of rows: ");
    // int row = sc.nextInt(); 
    // for(int i=0; i<row; i++) {
    //     for(int j=row-i; j>0; j--) {
    //         System.out.print(sym + " ");
    //     }
    //     System.out.println();
    // }

    // the video's method of doing inverted pyramid(this one's pretty clever too but mine also works) : 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("which symbol should be used for this operation : ");
    // char sym = sc.next().charAt(0);
    // System.out.print("Enter number of rows: ");
    // int row = sc.nextInt(); 
    // for(int i=row; i>0; i--) {
    //     for(int j=0; j<i; j++) {
    //         System.out.print(sym + " ");
    //     }
    //     System.out.println();
    // }

    // print the pattern(inverted half pyramid(rotated by 180deg)) 
    //        *
    //      * *
    //    * * *
    //  * * * *
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("which symbol should be used for this operation : ");
    // char sym = sc.next().charAt(0);
    // System.out.print("Enter number of rows: ");
    // int row = sc.nextInt(); 
    // for(int i=row; i>=1; i--) {
    //     for(int j=1; j<=row; j++) {
    //         if(j<i) {
    //             System.out.print("  ");
    //         } else {
    //             System.out.print(sym + " ");
    //         }
    //     }
    //     System.out.println();
    // }                               // this one is mine and took alot longer then it shouldve and i took a little help from the video because it was getting too long getting the answer but did it in the end 
    // this one is from the video 
    // int n = 4;
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // print the pattern: 
    // 1
    // 1 2
    // 1 2 3        // till 5 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter how long do you want this number ladder to be: ");
    // int n = sc.nextInt(); 
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=i; j++) {
    //         System.out.print(j + " ");
    //     }
    //     System.out.println();
    // }                            // done it really fast(lol it was too ezz because ive done many like this till now)

    // make the same thing as the one over this but just invert it up to down 1 to 5 /n 1 to 4
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("Enter another number for inverted number ladder: ");
    // int n = sc.nextInt(); 
    // for(int i=n; i>=1; i--) {
    //     for(int j=1; j<=i; j++) {
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

    // Floyd's triangle(cant describe this through less words go search on web or run this program hehe)
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter a number for printing Floyd's triangle: ");
    // int n = sc.nextInt();
    // int m = 1; 
    // for(int i=0; i<n; i++) {
    //     for(int j=0; j<=i; j++) {
    //         System.out.print(m+" ");
    //         m++;
    //     }
    //     System.out.println();
    // }

    // print a 0-1 triangle
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter your desired number of rows: ");
    // int n = sc.nextInt(); 
    // int one = 0; 
    // for(int i=0; i<n; i++) {
    //     for(int j=0; j<=i; j++) {
    //         switch (one) {
    //             case 1:
    //                 System.out.print("0 ");
    //                 one--;
    //                 break;
    //             case 0: 
    //                 System.out.print("1 ");
    //                 one++;
    //                 break;
    //             default:
    //                 System.out.print("an error occured(9)");
    //                 break;
    //         }
    //     }
    //     System.out.println();
    // }
        // same problem but i wanted to solve it in if else; 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter your desired number of rows: ");
    // int n = sc.nextInt(); 
    // int one = 0; 
    // for(int i=0; i<n; i++) {
    //     for(int j=0; j<=i; j++) {
    //         if (one == 1) {
    //             System.out.print("0 ");
    //             one--;
    //         } else if(one == 0) {
    //             System.out.print("1 ");
    //             one++;
    //         } else {
    //             System.out.print("error occured here(9)");
    //         }
    //     }
    //     System.out.println();
    // }
    
    // this solution is from the video for the 0-1 pattern 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter a number: "); 
    // int n = sc.nextInt(); 
    // for(int i=1; i<=n; i++) {
    //   for(int j=1; j<=i; j++) {
    //     int sum = i+j; 
    //     if(sum % 2 == 0) {
    //       System.out.print("1 ");
    //     } else {
    //       System.out.print("0 ");
    //     }
    //   }
    //   System.out.println();
    // }
    // this one's pretty gud method too; 
        

    // printing butterfly pattern
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter a number to print butterfly pattern of that size: ");
    // int s = sc.nextInt();
    // for(int i=1; i<=s; i++) {
    //   for(int j=1; j<=s*2; j++) {
    //     if(j<=i) {
    //       System.out.print("* ");
    //     } else if(j>=(s*2)-i+1) {
    //       System.out.print("* ");
    //     } else {
    //       System.out.print("  ");
    //     }
    //   } 
    // }
    // this one was tough but somehow solving this made me feel better lol(this one ^^^)
    // for(int i=1; i<=s; i++) {
    //   for(int j=1; j<=s*2; j++) {
    //     if(j<=s-(i-1)) {
    //       System.out.print("* ");
    //     } else if(j>=s+i) {
    //       System.out.print("* ");
    //     } else {
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    // this one was ever harder to do it but it feels really good after being able to find its solution

    // this will be the same bitturfly pattern code but this is from the video
    // int n = 4; 
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=i; j++) {
    //         System.out.print("* ");
    //     }
    //     for(int j=1; j<=2*(n-i); j++) {
    //         System.out.print("  ");
    //     }
    //     for(int j=1; j<=i; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // actual lower part showed in the video 
    // for(int i=n; i>=1; i--) {
    //     for(int j=1; j<=i; j++) {
    //         System.out.print("* ");
    //     }
    //     for(int j=1; j<=2*(n-i); j++) {
    //         System.out.print("  ");
    //     }
    //     for(int j=1; j<=i; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    //lower part(i did this before watching the tutorial trying to replicate the formula in reverse)
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=n-(i-1); j++) {
    //         System.out.print("* ");
    //     }
    //     for(int j=1; j<=2*(i-1); j++) { 
    //         System.out.print("  ");
    //     }
    //     for(int j=1; j<=n-(i-1); j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }


    // printing the pattern Solid Rhombus
    // eg. n=4
    //       * * * * *
    //     * * * * *
    //   * * * * *
    // * * * * * 
    // my try: 
    // Scanner sc = new Scanner(System.in);
    // System.out.print("enter a number for creating Solid Rhombus pattern: ");
    // int n = sc.nextInt(); 
    // for(int i=1; i<=n; i++) {
    //     for(int j=n-i; j>=1; j--) {
    //         System.out.print("  ");
    //     }
    //     for(int j=0; j<n; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // printing another pattern: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("Enter a number for printing the number pyramid: ");
    // int n = sc.nextInt(); 
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++) {
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }

    // printing a palindromic number pyramid : 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("Enter a number: ");
    // int n = sc.nextInt(); 
    // System.out.println("Palindromic number pyramid of "+ n);
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for(int j=i; j>=1; j--) {
    //         System.out.print(j);
    //     }
    //     for(int j=2; j<=i; j++) {
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // printing diamond shape 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("Enter a number for creating diamond shape: ");
    // int n = sc.nextInt(); 
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for(int j=i; j>=1; j--) {
    //         System.out.print("*");
    //     }
    //     for(int j=2; j<=i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // // lower half of the diamond: 
    // for(int i=n; i>=1; i--) {
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for(int j=i; j>=1; j--) {
    //         System.out.print("*");
    //     }
    //     for(int j=1; j<=i-1; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // the method shown in the video(this one's pretty clever too): 
    // int n = 4; 
    // System.out.println("via method shown in the video(n=" + n + "): ");
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=(2*i)-1; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=n; i>=1; i--) {
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=(2*i)-1; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    }
}
