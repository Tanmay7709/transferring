import java.util.*; 

// first making a class for book 
class Book {
  int bookId; 
  String bookName; 
  double price; 

  // parameterized constructor to initialize the data members 
  public Book(int bookId, String bookName, double price) {
    this.bookId = bookId; 
    this.bookName = bookName; 
    this.price = price; 
  }

  // method to display book details: 
  public void displayDetails() {
    System.out.printf("%-10d %-25s %-10.2f%n", bookId, bookName, price);
  }
}

// main class to execute the program as always: 

public class Assignment1B2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    // creating an array of book objects to hold 5 books 
    Book[] books = new Book[5];
    System.out.println("---Enter details for 5 books---");

    // loop for accepting data the for those 5 books 
    for(int i=0; i<books.length; i++) {
      System.out.println("enter details for book no." + (i+1) + " : ");
      System.out.print("\n"+"enter book id: ");
      int id = sc.nextInt(); 
      System.out.print("\n"+"enter book name    : ");
      String name = sc.nextLine(); 
      System.out.print("\n"+"enter book's price     : ");
      double price = sc.nextDouble(); 
      
      // initializing the object after collecting data for it through this loop 
      books[i] = new Book(id, name, price); 
    }

    // displaying the details
    System.out.println("--------------------------------------------");
    System.out.printf("%-10s %-25s %-10s%n", "Book ID", "Book Name", "Price");
    System.out.println("--------------------------------------------");
    for(Book book : books) {
      book.displayDetails();
    }
    System.out.println("--------------------------------------------");
    sc.close(); 
  }
}

// im fucking done with this shit 
// i cant do this anymore ill do this tomorrow arghhh
