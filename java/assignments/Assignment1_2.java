import java.util.*; 

class Assignment1_2 {
  
  static int reverse(int n) {
    // this will be reversed number i guess
    int rev = 0;
    // and this is remainder: 
    int rem; 
    
    while(n > 0) {
      rem = n % 10; 
      // System.out.println("rem = n % 10;");
      // System.out.println("rem : " + rem + "     n : " + n + "   % 10");
      rev = (rev * 10) + rem; 
      // System.out.println("rev = (rev * 10) + rem");
      // System.out.println("rev : " + rev + "       rem: " + rem);
      n = n / 10; 
      // System.out.println("n = n / 10");
      // System.out.println("n : " + n);
    }
    return rev; 
  }

  public static void main(String[] args) {
    // int n = 4526; 
    Scanner sc = new Scanner(System.in); 
    System.out.print("enter a number to print its reverse: ");
    int n = sc.nextInt(); 
    System.out.println("reversed number is: " + reverse(n));
  }
}
