// removing and displaying elements. [15 Marks]
import java.util.LinkedList; 

public class One1 {
  public static void main(String[] args) {
    LinkedList<String> fruits = new LinkedList<>(); 
    LinkedList<Integer> nums = new LinkedList<>();
    LinkedList<Float> fl = new LinkedList<>(); 

    // adding elements: by this format which is seamingly not hard at all to learn
    fruits.add("Apple");
    fruits.add("Banana"); 
    fruits.add("Strawberry"); 
    System.out.println("list: " + fruits);
    nums.add(0); 
    nums.add(3); 
    nums.add(5); 
    System.out.println("integer list: " + nums);
    fl.addFirst(32.43f); 
    System.out.println("float LinkedList: " + fl);

    // to count if im really that stupid or just an idiot 
    // int[] bagel = new int[5]; 
    // for(int i=0; i < bagel.length; i++) {
    //   System.out.println(bagel[i]);
    // }

  }
}
