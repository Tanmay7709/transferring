import java.util.Scanner; 

public class Sorting {
  public static void main(String[] args) {
    // bubble sort 
    int arr[] = {7, 8, 3, 1, 2};

    // System.out.print("array before bubble sort: ");
    // for(int i=0; i<arr.length; i++) {
    //   System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // // time complexity = O(n^2)
    //
    // // bubble sort 
    // for(int i=0; i<arr.length-1; i++) {
    //   for(int j=0; j<arr.length-i-1; j++) {
    //     if(arr[j] > arr[j+1]) {
    //       // swapping if the element is bigger then the next element
    //       int temp = arr[j]; 
    //       arr[j] = arr[j+1]; 
    //       arr[j+1] = temp;
    //     } 
    //   }
    // }
    //
    // System.out.print("array after bubble sort: ");
    // for(int i=0; i<arr.length; i++) {
    //   System.out.print(arr[i] + " ");
    // }
    // System.out.println();



    // // selection sort: 
    // System.out.print("array before bubble sort: ");
    // for(int i=0; i<arr.length; i++) {
    //   System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // // time complexity = O(n^2)
    //
    // for(int i=0; i<arr.length-1; i++) {
    //   int smallest = i; 
    //   for(int j=i+1; j<arr.length; j++) { 
    //     if(arr[smallest] > arr[j]) {
    //       smallest = j;
    //     }
    //   }
    //   int temp = arr[smallest]; 
    //   arr[smallest] = arr[i];
    //   arr[i] = temp; 
    // }
    //
    // System.out.print("array after bubble sort: ");
    // for(int i=0; i<arr.length; i++) {
    //   System.out.print(arr[i] + " ");
    // }
    // System.out.println();



    // insertion sort: 
    System.out.print("array before bubble sort: ");
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    // time complexity = O(n^2)

    // sorting here: 
    for(int i=1; i<arr.length; i++) {
      int current = arr[i]; 
      int j = i-1; 
      while(j >= 0 && current < arr[j]) {
        arr[j+1] = arr[j];
        j--;
      }

      // placing current 
      arr[j+1] = current;
    }

    System.out.print("array after bubble sort: ");
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

  }
}
