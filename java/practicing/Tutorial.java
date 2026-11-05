import java.util.*; 

class Tutorial {
  public static void main(String args[]) {
    // good ol' arithematic operations:
    // binary operators : +,  -,  *,  /,  %       // performs task on 2 operands 
    // Unary oparators : ++,  --                  // performs task on single operand 


    // // pre increment and post increment 
    // // pre increment : ++a      // firse change the value then use it; 
    // int a = 10; 
    // int b = 0; 
    // b = ++a;    
    // // first the value will be added to a and then b will take that value; 
    // System.out.println("pre increment : a was 10 and b was 0  --> b = ++a;");
    // System.out.println("a : " + a);
    // System.out.println("b : " + b);
    //
    // // post increment : a++     // first use the value then change it; 
    // int x = 10; 
    // int y = 0; 
    // y = x++; 
    // // first the value will be taken from x and given to y and then x will increment its value; 
    // System.out.println("post increment : x was 10 and y was 0  --> y = x++");
    // System.out.println("x : " + x);
    // System.out.println("y : " + y);
    //
    // pre decrement and post decrement also works the same so dont have to worry about it much; 


    // relational operators 
    // ==     equal to 
    // !=     !equal to 
    // >      greater then 
    // <      less then
    // >=     greater then equal to 
    // <=     less then equal to 


    // logical operators 
    // &&     AND 
    // ||     OR 
    // !      NOT
    

    // bitwise operators 
    // &      Binary AND    
    // 0 1 0 1 operand a
    // 0 1 1 0 operand b 
    // 0 1 0 0 after the & bitwise operation 
    //
    // |      Binary OR 
    // 0 1 0 1 operand a
    // 0 1 1 0 operand b 
    // 0 1 1 1 after the | bitwise operation 
    //
    // ^      Binary XOR 
    // 0 1 0 1 operand a
    // 0 1 1 0 operand b 
    // 0 0 1 1 after the ^ bitwise operation      // returns true when diff 
    //
    // ~      Binary One's Complement 
    // it gives the complement of the given bit values 0 --> 1 && 1 --> 0 
    // 0 1 0 1 operand a's complement(~) = 1 0 1 0 
    // 0 1 1 0 operand b's complement(~) = 1 0 0 1 
    // it is usually used to convert negetive num to positive num and vise-versa 
    //
    // <<     Binary Left Shift 
    // syntax : number(a variable or just a value) operand(<<) position-shift-in-numbers
    // eg. a = 0 1 0 1   
    // --> a << 1     : 1 0 1 0 
    // --> a << 2     : 0 1 0 0 
    // fill the gap with zeroes 
    //
    // >>     Binary Right Shift 
    // // syntax : number(a variable or just a value) operand(>>) position-shift-in-numbers
    // eg. a = 0 1 0 1   
    // --> a >> 1     : 0 0 1 0 
    // --> a >> 2     : 0 0 0 1
    // fill the gap with zeroes 
    

    // assignment operators
    // a = 10,  b = 5; 
    // =              a = b;    --> a = 5 
    // +=             a += b;   --> a = 15; 
    // -=             a -= b;   --> a = 5;
    // *=             a *= b;   --> a = 50; 
    // /=             a /= b;   --> a = 0; 
    
  }
}
