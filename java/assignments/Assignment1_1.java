import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 

public class Assignment1_1 {
  public static void main(String[] args) {
    // creating a 'BufferedReader' object to read input from the console (a.k.a user); 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.println("try typing something into the console bruH: ");
    
    try {
      // prompting user to enter a number: 
      System.out.print("enter a number to generate its multiplication table: ");
      String input = reader.readLine(); 
      int number = Integer.parseInt(input); 
      System.out.println("\nMultiplication table for " + number + " : ");
      System.out.println("----------------------------");
      
      // using a for loop to generate the multiplication table 
      for(int i=1; i<=10; i++) {
        System.out.println(number + " x " + i + " = " + number*i);
      }
    }
    catch (IOException e) {
      System.out.println("An error occured while reading the input.");
    }
    catch (NumberFormatException e) {
      System.out.println("Invalid input! please enter a valid integer.");
    }
  }
}
