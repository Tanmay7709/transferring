import java.util.*; 

public class Main3 {
  public static void main(String[] args) {
    // arrays: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter size for the array: ");
    // int size = sc.nextInt(); 
    // int[] numbers = new int[size];
    // for(int i=0; i<size; i++) {
    //   System.out.print("enter at index(" + (i+1) + "): ");
    //   numbers[i] = sc.nextInt();
    // }
    // for(int i=0; i<size; i++) {
    //   System.out.println("index " + (i+1) + " : " + numbers[i]);
    // }
    // // if we do not enter a value java automatically assigns null(0) value at that index
    
    // finding x 
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("fill an array with 5 values");
    // int num[] = new int[5];
    // for(int i=0; i<num.length; i++) {
    //   System.out.print("at index " + (i+1) + " : ");
    //   num[i] = sc.nextInt(); 
    // }
    // System.out.print("enter a number that u want to find within that array: ");
    // int x = sc.nextInt(); 
    // System.out.println(); 
    // for(int i=0; i<num.length; i++) {
    //   if(num[i] == x) {
    //     System.out.println("found " + x + " at index " + (i+1));
    //   } else {
    //     System.out.println("not at index " + (i+1));
    //   }
    // }

    // 2d array 
    // declaration : type[][] arrayName = new type[rows][columns] 
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("making a 2d array");
    // System.out.print("enter number of rows you want: ");
    // int row = sc.nextInt(); 
    // System.out.print("enter number of columns you want: ");
    // int col = sc.nextInt(); 
    // int[][] twoDArray = new int[row][col];
    // for(int i=0; i<row; i++) {
    //   for(int j=0; j<col; j++) {
    //     System.out.print("enter element for row(" + i + ") & column(" + j + ") : ");
    //     twoDArray[i][j] = sc.nextInt(); 
    //   }
    // }
    // System.out.println();
    // for(int i=0; i<row; i++) {
    //   for(int j=0; j<col; j++) {
    //     System.out.print(twoDArray[i][j] + "  ");
    //   }
    //   System.out.println();
    // }
    
    // q: 
    // take a matrix as input from the user. search for a given num x in the indices at which it occures: 
    // Scanner sc = new Scanner(System.in); 
    // System.out.println("create a matrix by alloting a row size and column size");
    // System.out.print("how many rows?: ");
    // int row = sc.nextInt(); 
    // System.out.print("how many columns?: ");
    // int col = sc.nextInt(); 
    // int[][] anArray = new int[row][col];
    // for(int i=0; i<row; i++) {
    //   for(int j=0; j<col; j++) {
    //     System.out.print("assign element at row(" + i + ") & column(" + j + ") : ");
    //     anArray[i][j] = sc.nextInt(); 
    //   }
    // }
    // System.out.print("enter an element to search it within that same array: ");
    // int x = sc.nextInt(); 
    // int y = 0; 
    // for(int i=0; i<row; i++) {
    //   for(int j=0; j<col; j++) {
    //     if(x == anArray[i][j]) {
    //       System.out.println("element found at index " + i + ", " + j);
    //       y++;
    //     }
    //   }
    // }
    // if(y == 0) {
    //   System.out.println("the element wasnt in the 2D array :|");
    // }
    












    Scanner sc = new Scanner(System.in); 
    // String 
    // String name = "bholu";
    // String fullName = "bholu kumar"; 
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter your name: ");
    // // String name = sc.nextLine();          // for taking a single string 
    // String fullName = sc.nextLine();         // for taking the whole line;
    // System.out.println("kimi no namae wa... " + fullName + "?");

    // concatenation(joining two strings)
    // Scanner sc = new Scanner(System.in); 
    // System.out.print("enter your firstname: ");
    // String firstName = sc.next(); 
    // System.out.print("enter your lastname: ");
    // String lastName = sc.next(); 
    // String fullName = firstName + " " + lastName;
    // System.out.println("full name : " + fullName);
    
    // String length and etc: 
    // System.out.print("enter some strings ANYTHING: ");
    // String str = sc.nextLine();
    // System.out.println("the length of your given string was: " + str.length());

    // comparing strings: 
    // System.out.print("enter a name: ");
    // String nameOne = sc.next(); 
    // System.out.print("enter another name: ");
    // String nameTwo = sc.next(); 
    // // the comparison is done by the string's size 
    // // s1 > s2     : +ve value 
    // // s1 == s2       : 0
    // // s1 < s2        : -ve value
    // if(nameOne.compareTo(nameTwo) == 0) {
    //   System.out.println("Strings are equal");
    // } else {
    //   System.out.println("Strings are not equal");
    // }
    
    // substrings: 
    // String sentence = "a string that says should say something cool";
    // // substring(st index, end index);
    // String smol = sentence.substring(30); // if we dont provide ending index it takes automatically takes the given string's last index;
    // System.out.println("sentence = " + sentence);
    // System.out.println("smol = " + smol);

    // * strings are immutable, you cannot modify them



    // string builder 
    // StringBuilder sb = new StringBuilder("tony");
    // System.out.println(sb);
    // char at index 0
    // System.out.println(sb.charAt(0));
    // set char at index 0 
    // sb.setCharAt(0, 'p');
    // System.out.println(sb);
    //
    // adding char at an index 
    // sb.insert(0, 's');
    // System.out.println(sb);
    
    // System.out.print("enter a string for making it reverse: ");
    // String reverse = sc.nextLine(); 
    // StringBuilder sb = new StringBuilder(reverse);
    // for(int i=0; i<sb.length()/2; i++) {
    //   int front = i; 
    //   int back = sb.length() - 1 - i; 
    //
    //   char frontChar = sb.charAt(front); 
    //   char backChar = sb.charAt(back);
    //
    //   sb.setCharAt(front, backChar);
    //   sb.setCharAt(back, frontChar); 
    // }
    // System.out.println(sb);

    




    // bit operations(explained in Tutorial.java) : 
    // some insight of what we're getting into : Get bit, Set bit, Clear bit, Update bit
    
    // Get Bit
    // get the 3rd bit(position = 2) of a number n. (n = 0101)
    // Bit mask: 1 << i; i = 2; 
    // Operation: AND 
    int n = 5; 
    int pos = 2; 
    int bitmask = 1 << pos;
    if((bitmask & n) == 0) {
      System.out.println("bit was zero ");
    } else {
      System.out.println("bit was one ");
    }
  }
}
