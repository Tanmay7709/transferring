// this will be used for functions and methods: 

import java.util.*; 

public class Main2 {

  // public static void printInput(String input) {
  // System.out.println("you entered: " + input);
  // return;
  // }

  // public static int countSum(int a, int b) {
  //   System.out.println("sum of ("+ a + "+" + b + "): " + (a+b));
  //   return 1; 
  // }

  // public static int countFactorial(int n) {
  //   if(n < 0) {
  //     System.out.println("Error occured!");
  //     System.out.println("Enter an integer greater then or equal to 1");
  //     return 0; 
  //   }
  //   int factorial = 1; 
  //   for(int i=n; i>=1; i--) {
  //     factorial = factorial * i; 
  //   }
  //   System.out.println("factorial of(" + n + "): " + factorial);
  //   return 0; 
  // }
  
  // 10 practice questions using functions starts here: 
  // 1: 
  // public static int countAverage(int a, int b, int c) {
  //   int sum = a + b + c; 
  //   sum = sum / 3; 
  //   System.out.println("average of those 3 numbers is: " + sum);
  //   return sum; // i really dont know what to do about this thing returning sum (send help ;|)
  // }
  
  // 2: 
  // public static int sumOdd(int n) {
  //   if(n <= 0) {
  //     System.out.println("enter a positive integer please");
  //     return 0;
  //   } 
  //   int m = 0; 
  //   for(int i=1; i<=n; i++) {
  //     if(i % 2 == 0) {
  //       m++;
  //     }
  //   }
  //   System.out.println("total odd numbers between 1 & " + n + ": " + m);
  //   return m; 
  // }
  
  // 3: 
  // public static int greaterNum(int a, int b) {
  //   if(a > b) {
  //     System.out.println(a + " is greater then " + b);
  //   } else if(a < b) {
  //     System.out.println(b + " is greater then " + a);
  //   } else if(a == b) {
  //     System.out.println(a + " is equal to " + b);
  //   } else {
  //     System.out.println("error occured!!! try again");
  //   }
  //   return 0; 
  // }
  
  // 4: 
  // public static float calcCircumference(float a) {
  //   float p = 3.14f;      // converted 3.14 to float by adding an f at the end of it because for some reason it just doesnt accept it as float and takes it as a double intil i put an f there; 
  //   float c = 2 * p * a;
  //   System.out.println("the circumference of the circle with the radius of " + a + " is: " + c);
  //   return c; 
  // }
  
  // 5: 
  // public static void age(int a) {
  //   if(a >= 18) {
  //     System.out.println("you are an adult in age and can vote :)");
  //   } else if(a < 18) {
  //     System.out.println("you are a minor and cannot vote at this age");
  //   } else {
  //     System.out.println("an error occured, please try again");
  //   }
  //   return; 
  // }
  
  // 6: 
  // public static int infiniteLoop(int a) {
  //   do {
  //     if(0 == 0) {
  //       System.out.print("0 ");
  //     }
  //   } while (a >= 0 || a <= 0);
  //   return 0; 
  // }
  
  // 7:
  // public static void printPNZ(int a, int b) {
  //   int p = 0; 
  //   int n = 0; 
  //   int z = 0; 
  //   for(int i=a; i<=b; i++) {
  //     if(i == 0 || i % 10 == 0) {
  //       System.out.print(i + " ");
  //       z++; 
  //     } else if(i > 0) {
  //       System.out.print(i + " ");
  //       p++; 
  //     } else if(i < 0) {
  //       System.out.print(i + " ");
  //       n++; 
  //     } else {
  //       System.out.println("* ");
  //     }
  //   }
  //   System.out.println();
  //   System.out.println("summary of the printed numbers: ");
  //   System.out.println("positive numbers     : " + p);
  //   System.out.println("negetive numbers     : " + n);
  //   System.out.println("numbers with zeroes  : " + z);
  // }
  
  // 8: 
  // public static void powerOf(int a, int b) {
  //   // i had almost forgot about that i could just use **(power of operator) but i searched it up and there is no such power of oporator; sed; 
  //   if(b < 2) {
  //     System.out.println("please enter the power of number over or equal to 2");
  //     return; 
  //   }
  //   int n = a; 
  //   for(int i=2; i<=b; i++) {
  //     a = a * n; 
  //   } 
  //   System.out.println("answer of " + n + "^" + b + " : " + a);
  // }
  
  // 9: 
  // public static void greatestCommonDivisor(int x, int y) {
  //   if (x < 0 || y < 0) {
  //     System.out.println("please enter positive numbers and try again :)");
  //     return; 
  //   }
  //   int z, a, b;
  //   a = x; 
  //   b = y; 
  //   while(y != 0) {
  //     z = x % y; 
  //     x = y; 
  //     y = z; 
  //   }
  //   System.out.println("greatest common divisor between(" + a + " and " + b + ") = " + x);
  //   // System.out.println("i think an error occured!! sorry im dum :p");    // i had printed this because of a previous code snippet and just kept it here because i can; 
  // }
  
  // 10: 
  // public static void fibonacciNum(int a) {
  //   int x=0, y=1, z; 
  //   for(int i=0; i<a; i++) {
  //     if(i <= 1) {
  //       System.out.print(i + " ");
  //     } else {
  //       z = x + y; 
  //       x = y; 
  //       y = z; 
  //       System.out.print(z + " ");
  //     }
  //   }
  // }

  public static void main(String[] args) {
    // printing the input given by the user using a function: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter something to print it in the terminal: ");
    // String something = sc.next(); 
    // printInput(something);


    // printing sum using function: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter first number: ");
    // int first = sc.nextInt(); 
    // System.out.print("enter second number: ");
    // int second = sc.nextInt(); 
    // countSum(first, second);


    // making a function to print factorial: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("Enter a number to get its factorial: ");
    // int num = sc.nextInt(); 
    // System.out.println(countFactorial(num));
    
    // add 10 practice questions for function and methods: 
    // 1:
    // getting 3 numbers from user as input and printing their avarage: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("enter 3 numbers to print their average: ");
    // System.out.print("enter first number     : ");
    // int a = sc.nextInt(); 
    // System.out.print("enter second number    : ");
    // int b = sc.nextInt();
    // System.out.print("enter third number     : ");
    // int c = sc.nextInt();       // +notes: we can also add these 3 input steps into the function lol 
    // countAverage(a, b, c);
    
    // 2: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter a number to get total odd numbers till that number: ");
    // int a = sc.nextInt(); 
    // sumOdd(a); 

    // 3: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("Enter 2 numbers to get the greater number between the two");
    // System.out.print("enter first number     : ");
    // int a = sc.nextInt(); 
    // System.out.print("enter second number    : ");
    // int b = sc.nextInt(); 
    // greaterNum(a, b);
    
    // 4: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter radius of a circle to get its circumference: ");
    // float f = sc.nextFloat(); 
    // calcCircumference(f);

    // 5: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("what is your age: ");
    // int a = sc.nextInt(); 
    // age(a); 
    
    // 6: 
    // Scanner sc = new Scanner(System.in);
    // System.out.print("enter any number to start an infinite loop: ");
    // int a = sc.nextInt(); 
    // infiniteLoop(a); // bruh this function basically does nothing 
    
    // 7: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("enter a starting number and an ending number");
    // System.out.println("(if an error occures it will be shown as '*' in place of the supposedly number)");
    // System.out.print("starting number    : ");
    // int a = sc.nextInt();
    // System.out.print("ending number      : ");
    // int b = sc.nextInt(); 
    // printPNZ(a, b);
    
    // 8:
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("getting number and its power");
    // System.out.print("enter a number     : ");
    // int a = sc.nextInt(); 
    // System.out.print(a + " to the power of  : ");
    // int b = sc.nextInt(); 
    // powerOf(a, b); 
    
    // 9: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("enter 2 numbers to find their greatest common divisor");
    // System.out.print("enter first number    : ");
    // int a = sc.nextInt(); 
    // System.out.print("enter second number   : ");
    // int b = sc.nextInt(); 
    // greatestCommonDivisor(a, b);  
    // after so  much struggle this is done finally ; 
    
    // 10: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("how many fibonacci numbers do you want to print?: ");
    // int n = sc.nextInt(); 
    // fibonacciNum(n);
    
    
  }
}
