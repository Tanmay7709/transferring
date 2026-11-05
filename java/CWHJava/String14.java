import java.util.*; 

class String14 {
  public static void main(String[] args) {
    // learning a little more about Strings (getting kinda tired but hev to duh it)
    Scanner sc = new Scanner(System.in);

    // String pong = "Strawberry"; 
    // System.out.println("String : " + pong + "\n");

    // substring(although i kinda know it but still)
    // String seed = pong.substring(5);
    // String drink = pong.substring(0, 5);
    // System.out.println(seed);
    // System.out.println(drink);
    
    // replace 
    // System.out.println("replacing b with p");
    // System.out.println(pong.replace('b', 'p'));
    // System.out.println("now replacing 'Stra' with 'Cho'");
    // System.out.println(pong.replace("Stra", "Cho"));
    
    // startsWith   && endsWith
    // System.out.println("startsWith 'Str'?");
    // System.out.println(pong.startsWith("Str"));
    // System.out.println("ends with 'cherry'?");
    // System.out.println(pong.endsWith("cherry"));
    
    // charAt
    // System.out.println("charAt[2]");
    // System.out.println(pong.charAt(2));
    // System.out.println("charAt[4]");
    // System.out.println(pong.charAt(4));
    
    // indexOf
    // System.out.println("indexOf('r')");
    // System.out.println(pong.indexOf('r'));
    // System.out.println("indexOf('rr')  // use double quotes here(i couldnt)");
    // System.out.println(pong.indexOf("rr"));
    // System.out.println("indexOf('r', 4) searches from idx 4    // lastIndexOf can also use this");
    // System.out.println(pong.indexOf('r', 4));
    // System.out.println("lastIndexOf('rr')   // i dont get this??");
    // System.out.println(pong.lastIndexOf("rr"));

    // equals 
    // System.out.println("pong.equals('Strawberry')");
    // System.out.println(pong.equals("Strawberry"));
    // System.out.println("pong.equals('strawberry')");
    // System.out.println(pong.equals("strawberry"));
    // System.out.println("pong.equalsIgnoreCase('strawberry')");
    // System.out.println(pong.equalsIgnoreCase("strawberry"));
    
    // escape sequence characters 
    // System.out.println("to use double quotes in strings : \\\" ");
    // System.out.println("using here \"lol\" ");
    // System.out.println("to use backslash in strings     : \\\\");
    // System.out.println("\\example \\here");
    








    // solving problems after this 
    // prublem 1: convert into lowercase 
    // System.out.print("enter something to convert it into lowercase: ");
    // String s = sc.nextLine(); 
    // s = s.toLowerCase(); 
    // System.out.println("lowercased: " + s);

    //prob.2 : replace " " with "_"
    // System.out.print("type something cool with spaces: ");
    // String some = sc.nextLine(); 
    // some = some.replace(" ", "_");
    // System.out.println("see dis: " + some);

    // // prob.3 : write a java program to fill in a letter template which looks like this: 
    // // letter = "Dear <name>, thanks a lot"
    // // replace <name> with string(someName)
    // System.out.print("enter your name: ");
    // String name = sc.next(); 
    // String format = "Dear <name>, thanks a lot"; 
    // format = format.replace("<name>", name); 
    // System.out.println("see if it worked?...");
    // System.out.println(format);
    
    // // prob.4 : write a java program to detect double and triple spaces in a string
    // System.out.print("this program will detect double and triple spaces:");
    // String s = sc.nextLine(); 
    // int d = 0;
    // int t = 0; 
    // int q = 0; 
    // for(int i=0; i<s.length(); i++) {
    //   if(s.charAt(i) == ' ') {
    //     if(s.charAt(i+1) == ' ') {
    //       if(s.charAt(i+2) == ' ') {
    //         t++; 
    //         i = i+2; 
    //       } else {
    //         d++; 
    //         i = i+1; 
    //       }
    //     }
    //   }
    // }
    // System.out.println("double spaces : " + d);
    // System.out.println("triple spaces or more : " + t);
    // // its still not gud but its the best i could think of as of now...

    // // prob.5 : write a program to format the following letter using escape sequence characters: 
    // // letter = "dear Harry, This Java Course is nice. Thanks"
    // // this one's easy lol; 
    // System.out.println("layouting a letter with escape sequence characters : ");
    // System.out.println("sentence: ");
    // System.out.println("\"Dear Harry, This Java Course is nice. Thanks\"");
    
  


    // // answers from the yt video and seeing my answers to those questions and kinda judge them...
    // // prob 1.
    // System.out.println("too easy");
    //
    // //prob 2. 
    // System.out.println("just using a replace string method so not that hard either");
    //
    // // prob 3. 
    // System.out.println("just replace function again");

    // prob 4. 
    // System.out.println("actually hard and made me think for a while to get somewhat of a solution which doesn't look that good tbh and functionality is also meh meh but is not the worst of my creations so okeish but not that gud");
    // System.out.println("just using indexOf(\"  \") and (\"   \")");
    // System.out.println("if -1 comes out of either of them, it means it isnt there");
    // System.out.println("just doing this program here because i want to ");
    // System.out.print("enter the sentence : ");
    // String s = sc.nextLine(); 
    // if(s.indexOf("  ") == -1) {
    //   System.out.println("there's NOT a single double spaces in the string ");
    // } else {
    //   System.out.println("there are double spaces in the string");
    // }
    // if(s.indexOf("   ") == -1) {
    //   System.out.println("there's NOT a single triple spaces in the string");
    // } else {
    //   System.out.println("there are triple spaces in the string");
    // }
    
    // // prub 5. 
    // System.out.println("just escape sequence formatting, nothing much");
  }
}
