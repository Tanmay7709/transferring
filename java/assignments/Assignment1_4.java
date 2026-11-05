import java.util.*; 

// definition of MyDate; 

class MyDate {
  // data members (instance variables) 
  private int dd; 
  private int mm; 
  private int yy;

  // default constructor: 
  // initialize the date to a default value(e.g., 01-01-2026) 
  public MyDate() {
    this.dd = 1; 
    this.mm = 1; 
    this.yy = 2026; 
  }

  // parameterized constructor 
  // initializing the data members with user-provided values : oke :0
  public MyDate(int dd, int mm, int yy) {
    this.dd = dd; 
    this.mm = mm; 
    this.yy = yy; 
  }

  // method to display the date in dd-mm-yy format; 
  public void DisplayDate() {
    // string format ensures two-digit padding  ...umm interesting and real; 
    // for days and months (e.g., 05 instead of 5)
    System.out.printf("Date : %02d-%02d-%d%n", dd, mm, yy);
  }
}


class Assignment1_4 {
  public static void main(String[] args) {
    // creating an object using default constructor
    System.out.println("creating data using default constructor: ");
    MyDate dafaultDate = new MyDate();
    dafaultDate.DisplayDate();
    System.out.println();
    System.out.println("creating data using parameterized constructor: ");
    MyDate customDate = new MyDate(22, 7, 2026);
    customDate.DisplayDate();
  }
}
