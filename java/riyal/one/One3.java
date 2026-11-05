


class One3 {
  private static int objectCount = 0;   // this is a static variable which can be used all across the code 
  private String name;    // this is instance variable and it will remain here in this class only
  
  public void Demo(String name) {
    this.name = name;     // "this.name" refers to instance variable private String name; 
    objectCount++;      // incrementing static object count by one and it will remain as one until we make further changes
    System.out.println("object created " + this.name);
  }

  // static method to access static variables: 
  public static void displayCount() {
    System.out.println("object count : " + objectCount);
  }

  // Deprecated finalize method demonstrating object destruction
  @Override
  protected void finalize() throws Throwable {
      System.out.println("Object '" + this.name + "' is being garbage collected.");
      objectCount--;
      super.finalize();
  }
}
public class One3 {
    public static void main(String[] args) {
        // Using 'new' to create objects
        Demo obj1 = new Demo("Alpha");
        Demo obj2 = new Demo("Beta");

        // Calling static method using the class name
        Demo.displayCount();

        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggesting garbage collection (JVM decides when to actually run it)
        System.gc();
        
        // Brief pause to allow GC to trigger finalize output in some environments
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}