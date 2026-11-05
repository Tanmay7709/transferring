import java.util.*; 

public class IntegerNumber {
  // private data member
  private int num; 

  // constructor : 
  public int IntegerNumber(int num) {
    this.num = num; 
  }

  // method to calculate square
  public int calculateSquare() {
    return num * num; 
  }

  // method to calculate cube 
  public int calculateCube() {
    return num * num * num; 
  }

  public static void main(String[] args) {
    // checking if an argument is provided 
    if(args.length < 1) {
      System.out.println("please provide an integer as a command line argument...");
      return; 
    }

    try {
      // parse the command line argument to an integer 
      Scanner sc = new Scanner(System.in); 
      int input = sc.nextInt(); 

      // create an object of IntegerNumber
      IntegerNumber obj = new IntegerNumber(input); 

      // display results: 
      System.out.println("number: " + input);
      System.out.println("square: " + obj.calculateSquare());
      System.out.println("cube  : " + obj.calculateCube());
    }

    catch(NumberFormatException e) {
      System.out.println("error! please provide a valid integer");
    }
  }
}

// we'll get back to this again 
