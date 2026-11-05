

public class Recursion0 {
  // public static void rec(int n) {
  //   if(n == 0) {
  //     System.out.println();
  //     return; 
  //   }
  //   System.out.print(n + " ");
  //   rec(n-1); 
  //   // this prints n - -> 1
  // }

  // public static void rec0(int st, int end) {
  //   if(st > end) {
  //     System.out.println();
  //     return; 
  //   } 
  //   System.out.print(st + " ");
  //   rec0(st+1, end); 
  //   // prints numbers st to end
  // }

  // // method shown in video for 1 to n; 
  // public static void printNum(int n) {
  //   if(n == 6) {
  //     return; 
  //   }
  //   System.out.print(n + " ");
  //   printNum(n+1);        // the user doesnt cannot give a certain input that commands this method so not gud 
  // }
  
  
  // // print sum of first n natural numbers 
  // public static void naturalNumSum(int sum, int n) {
  //   if(n == 0) {
  //     System.out.println("total sum of natural numbers: " + sum);
  //     return; 
  //   } 
  //   sum += n; 
  //   naturalNumSum(sum, n-1); 
  // }

  // // factorial : 
  // public static int calcFactorial(int n) {
  //   if(n == 1 || n == 0) {
  //     return 1; 
  //   }
  //   int fact_nm1 = calcFactorial(n-1);
  //   int fact = n * fact_nm1;              // this can also be done with directly doing n *= calcFactorial(n-1); which reduces one line of code which makes me look *COOL* hehe  
  //   return fact; 
  // }

  // // fibonacci sequence: 
  // public static void fibonacci(int n,int m,int a) {
  //   if(a == 0) {
  //     return; 
  //   }
  //   int k = n + m; 
  //   System.out.print(k + " "); 
  //   fibonacci(m, k, a-1); 
  // }

  // calculate power of x^n: 
  public static int calcPower(int x, int n) {
    if(n == 0) {
      return 1; 
    }
    if(x == 0) {
      return 0; 
    }
    int xPownm1 = calcPower(x, n-1);
    int xPown = x * xPownm1;          // this can also be done by : xPown *= calcPower(x, n-1); 
    return xPown; 
  }

  // better method for calculating: x^n
  public static int calcPowerBetter(int x, int n) {
    if(n == 0) {
      return 1; 
    }
    if(x == 0) {
      return 0; 
    }
    if(n % 2 == 0) {
      return calcPowerBetter(x, n/2) * calcPowerBetter(x, n/2); 
    } else {
      return calcPowerBetter(x, n/2) * calcPowerBetter(x, n/2) * x; 
    }
  }

  public static void main(String[] args) {
    // rec(5);
    // rec0(1, 5);
    // printNum(1);
    
    // naturalNumSum(0, 7);
    // System.out.println("factorial of 5: " + calcFactorial(5));
    
    // System.out.print("0 1 ");   // because the function under this doesnt print 0 1 when starting
    // fibonacci(0, 1, 5);

    int ans = calcPower(5, 4);
    System.out.println("5^4 : " + ans);
    int betterAns = calcPowerBetter(5, 4);
    System.out.println("5^4 : " + betterAns);
  }
}


