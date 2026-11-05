import java.util.*; 

public class Chapter31 {
  // // static method : it can be used without an object and can be called from anywhere across the code; 
  // static int sum(int x, int y) {
  //   int z = x + y; 
  //   return z; 
  // }

  // // non-static method : it needs an object to be called and used in the code 
  // int minus(int x, int y) {
  //   int z = x - y; 
  //   return z; 
  // }

  // static void tellJoke() {
  //   System.out.println("this joke was copied from a single search on an average browser");
  // }

  // // variable arguments : 
  // static int sum(int ...arr) {
  //   int result = 0; 
  //   for(int a: arr) {
  //     result += a; 
  //   }
  //   return result; 
  // }

  // // recursion with factorial example: 
  // static int factorial(int n) {
  //   if(n > 1) {
  //     n = n * factorial(n-1);
  //   } else if(n == 0 || n == 1) {
  //     return 1; 
  //   } else {
  //     System.out.println("you have entered invalid input. enter a number greater than 1 to get its factorial");
  //   }
  //   return n; 
  // }
  
  // // fibonacci sequence using recursion: 
  // static void fibonacci(int n) {
  //   int i = 0, j = 1; 
  //   if(n >= 2) {
  //     System.out.print("0 1 ");
  //     while(n-2 > 0) {
  //       System.out.print(i+j + " ");
  //       i++;
  //       j++; 
  //       n--; 
  //     }
  //   } else {
  //     System.out.println("please enter a bigger number to get a longer array of fibonacci sequence(eg. greater then 2)");
  //   }
  // }

  // // #1. number table with formatting used in printing because ive never done it before: 
  // static void numTable(int n) {
  //   for(int i=1; i<=10; i++) {
  //     System.out.format("%d x %d = %d\n", n, i, n*i);
  //   }
  // }

  // static int naturalNumSum(int n) {    
  //   if(n > 0) {
  //     n = n + naturalNumSum(n-1);
  //   } else if(n < 0){
  //     System.out.println("error occured! enter a positive number next time please");
  //   }
  //   return n; 
  // }

  // // #5. printing n'th index of fibonacci sequence using recursion: 
  // static int fib(int n) {
  //   if(n == 1 || n == 2) {    // this is a trick to short 0 and 1 output(i explain really badly but just observe what this OR operator does and that'll probably explain it)
  //     return n-1; 
  //   } else {
  //     return fib(n-1) + fib(n-2);     // to use these fib() in the method u need to use fib as method name i guess because when i tried without naming my method fib, it didnt work 
  //   }
  // }

  // // #6. old:testing some things and confirming my doubts   | new: yeah it works i can directly take the whole array into the method; 
  // static int avgSum(int ...arr) {
  //   int sum = 0;
  //   System.out.print("your array: ");
  //   for(int b: arr) {
  //     System.out.print(b + " ");
  //   }
  //   System.out.println();
  //   for(int a: arr) {
  //     sum += a;
  //   }
  //   int avg = sum / arr.length; 
  //   return avg; 
  // }
  
  // // #7. printing half triangle with recursion: 
  // static void triangleRec(int n) {
  //   if(n > 0) {
  //     triangleRec(n-1);      // i took help from tutorial while doing this one problem because i just couldnt think anything for it and had less time on hand; do better in future with this knowledge;
  //     for(int i=n; i>0; i--) {
  //       System.out.print("* ");
  //     }
  //     System.out.println();
  //   }
  // }

  // // #8. printing inverted half trianlge with recursion: 
  // static void triangleInvertedRec(int n) {
  //   if(n > 0) {
  //     for(int i=n; i>0; i--) {
  //       System.out.print("* ");
  //     }
  //     System.out.println();
  //     triangleInvertedRec(n-1); 
  //   }
  // }     // this took way long and i got a little clue from gemini thats why i could solve this problem 

  // // #9. converting celsius to fahrenheit: 
  // static void convFahrenheit(float n) {
  //   float ans = n * 9/5 + 32; 
  //   System.out.format("after converting %f celsius to fahrenheit: %f\n", n, ans);
  // } 

  // // #10. natural numbers sum but with iterative approach
  // static void naturalNumSumIter(int n) {
  //   if(n > 0) {
  //     int sum = 0; 
  //     for(int i=n; i>0; i--) {
  //       sum += i; 
  //     }
  //     System.out.format("total sum of first %d natural numbers: %d\n", n, sum);
  //   } else {
  //     System.out.println("numbers below 1 cannot be included in sum of natural number's sum try again mr");
  //   }
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    // // static method 
    // int a = 32, b = 26;
    // int c = sum(a, b); 
    // System.out.println("c : " + c);

    // // non-static method: 
    // Chapter31 obj = new Chapter31(); // creating an object from which the non-static method could be called; 
    // int n = 32, m = 22; 
    // int p = obj.minus(n, m);
    // System.out.println("p : " + p);

    // tellJoke();
    

    // next topic : method overloading: 
    // you already know this one and it goes like this for the reference 
    // static void boo() {// stuff here}; 
    // static void boo(int a) {// stuff here};
    // static void boo(int a, int b) {// stuff here}; 


    // // vairable arguments 
    // // a function with VarArg can be created in java using the following syntax: 
    // // public static void function(int ...arr) {
    // //   // arr is available here as int[] arr 
    // // }
    // // my thoughts : i think its useful for singular type of operation on every element since it stores all elements in an array and array can only store one type(datatype) of variable 

    // System.out.println("this is about using variable arguments : ");
    // System.out.println("sum of 2 is  : " + sum(2));
    // System.out.println("sum of 3 + 4    : " + sum(3, 4));
    // System.out.println("sum of 3 + 4 + 5    : " + sum(3, 4, 5));
    // System.out.println("sum of 3 + 4 + 5 + 6    :" + sum(3, 4, 5, 6));


    // // recursion : 
    // // a function in java can call itself such calling of function by itself is called recursion
    // System.out.print("enter any number for getting its factorial: ");
    // int n = sc.nextInt(); 
    // System.out.println("factorial of " + n + " : " + factorial(n));

    // // do fibonacci sequence in recursion :  
    // System.out.print("enter a number of how long your fibonacci sequence should be: ");
    // int a = sc.nextInt();
    // fibonacci(a); 
    

    // practice questions(tutorial #35):

    // // #1. a number table based on user input but using format for printing in method: 
    // System.out.print("enter any number to get its table: ");
    // int n = sc.nextInt();
    // numTable(n); 

    // #2. printing a star pattern that goes from 1 to n and looks like half triangle is too easy and ive done it so skip;

    // // #3. write a recursive function to calculate sum of first n natural numbers: 
    // System.out.print("enter a number : ");
    // int n = sc.nextInt(); 
    // System.out.println("sum of "+ n +" natural numbers: " + naturalNumSum(n));

    // #4. creating a method to print upside down half triangle pattern // not hard at all so skip
    
    // // #5. write a function to print n'th term of fibonacci series using recursion 
    // System.out.print("which index of fibonacci sequence do u want? : ");
    // int n = sc.nextInt(); 
    // System.out.println("the fibonacci number at index("+ n +") : " + fib(n));

    // // #6. write a function to find average of a set of numbers passed as arguments 
    // System.out.print("how many numbers do u wanna add and get their avg: ");
    // int n = sc.nextInt();     // i think there could be a better way for getting the scanner inside that thing then running it, i just dont know it yet;  
    // int[] yoo = new int[n];
    // for(int i=0; i<n; i++) {
    //   System.out.print("enter integer at index ("+ i +") : ");
    //   yoo[i] = sc.nextInt();
    // }
    // System.out.println();
    // System.out.println("your average: " + avgSum(yoo));
    
    // // #7. repeat #2 with recursion 
    // System.out.print("enter a number for sizing half triangle: ");
    // int n = sc.nextInt(); 
    // triangleInvertedRec(n);
    
    // // #8. repeat #4 using recursion 
    // System.out.print("enter a number for sizing inverted half triangle: ");
    // int n = sc.nextInt(); 
    // triangleRec(n);

    // // #9. write a function to convert celsius temperature into fahrenheit
    // System.out.print("enter any celsius temperature to convert it into fahrenheit: ");
    // float f = sc.nextFloat(); 
    // convFahrenheit(f);

    // // #10. repeat #3 using iterative approach; 
    // System.out.print("enter the ammount of first n natural numbers that u wanna sum: ");
    // int n = sc.nextInt(); 
    // naturalNumSumIter(n);

      



  }
}
