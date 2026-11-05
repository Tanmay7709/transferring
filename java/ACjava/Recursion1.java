import java.util.*;

public class Recursion1 {
  // public static void towerOfHanoi(int n, String src, String helper, String dest) {
  //   if(n == 1) {
  //     System.out.println("transfer disk "+ n +" from "+ src +" to "+ dest);
  //     return; 
  //   }
  //   towerOfHanoi(n-1, src, dest, helper);
  //   System.out.println("transfer disk "+ n +" from "+ src +" to "+ dest);
  //   towerOfHanoi(n-1, helper, src, dest); 
  // } 

  // // printing the string in reverse: 
  // public static void revString(int len, String str) {
  //   if(len == 0) {
  //     return; 
  //   }
  //   System.out.print(str.charAt(len-1));
  //   revString(len-1, str); 
  // }


  public static int first = -1; 
  public static int last = -1; 
  public static void findOccurance(String str, int idx, char element) {
    if(idx == str.length()-1) {
      System.out.println("first element index : " + first);
      System.out.println("last element index  : "+ last);
      return; 
    }
    if(str.charAt(idx) == element) {
      if(first == -1) {
        first = idx; 
        last = idx; 
      } else {
        last = idx; 
      }
    }
    findOccurance(str, idx+1, element); 
  }
  public static void main(String[] args) {
    // int n = 3; 
    // towerOfHanoi(n, "S", "H", "D");
    // // time complexity: 2^n 


    // // printing reverse string: 
    // String str = "abcd"; 
    // revString(str.length(), str); 


    // find first and last occurance: 
    String str = "abaacdaefaah";
    findOccurance(str, 0, 'a');

  }
}

// lets do this tomorrow 
