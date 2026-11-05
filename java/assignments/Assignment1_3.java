import java.util.*; 

class Assignment1_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    // accept the size of an array 
    System.out.print("enter the number of elements in the array: ");
    int size = sc.nextInt(); 
    int[] array = new int[size]; 
    int sum = 0; 

    // accepting elements from the user and calculating the sum; 
    System.out.println("Enter " + size + " elements: ");
    for(int i=0; i<size; i++) {
      System.out.print("element no." + (i+1) + " : ");
      array[i] = sc.nextInt(); 
      sum += array[i]; 
      // accumulating the sum 
    }

    // sorting the array in ascending order; 
    Arrays.sort(array); 

    // display the results; 
    System.out.println("\n ---results--- ");
    System.out.println("sum of the elements : "+ sum);
    System.out.println("elements in ascending order: ");
    for(int num : array) {
      System.out.println(num + " ");
    }

    sc.close(); 
  }
}
