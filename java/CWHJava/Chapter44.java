import java.util.Scanner;

public class Chapter44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // // #1. 
    // Cylinder c0 = new Cylinder(); 
    // // using setters for doing there things
    // c0.setRadius(); 
    // c0.setHeight(); 
    // // printing it i guess; 
    // c0.getRadius(); 
    // c0.getHeight(); 


    // // #2. 
    // Cylinder c1 = new Cylinder(); 
    // c1.setHeight(); 
    // c1.setRadius(); 
    // c1.calcSurfaceArea();
    // c1.calcVolume(); 


    // // #3. 
    // Cylinder c2 = new Cylinder(45.30, 12.50);
    // c2.calcSurfaceArea(); 
    // c2.calcVolume(); 

  }
}

// // #1. create a class cylinder and use getters and setters to set its radius and height
// class Cylinder {
//   Scanner sc = new Scanner(System.in); 
//   private float radius; 
//   private float height; 
//   // setters lol: 
//   public void setRadius() {
//     System.out.print("set radius for the cylinder(in cm): ");
//     radius = sc.nextFloat(); 
//   }
//   public void setHeight() {
//     System.out.print("set height for the cylinder(in cm): ");
//     height = sc.nextFloat();
//   }
//   // getters lol: 
//   public void getRadius() {
//     System.out.println("cylinder's radius that you set: " + radius + "cm");
//   }
//   public void getHeight() {
//     System.out.println("cylinder's height that you set: " + height + "cm");
//   }
// }


// // #2. use #1. to calculate surface area and volume of the cylinder: 
// class Cylinder {
//   Scanner sc = new Scanner(System.in); 
//   private float radius; 
//   private float height; 
//   // setters lol: 
//   public void setRadius() {
//     System.out.print("set radius for the cylinder(in cm): ");
//     radius = sc.nextFloat(); 
//   }
//   public void setHeight() {
//     System.out.print("set height for the cylinder(in cm): ");
//     height = sc.nextFloat();
//   }
//   // getters lol: 
//   public void getRadius() {
//     System.out.println("cylinder's radius that you set: " + radius + "cm");
//   }
//   public void getHeight() {
//     System.out.println("cylinder's height that you set: " + height + "cm");
//   }
//   public void calcSurfaceArea() {
//     // float area = 2 * 3.14 * radius * (radius + height);
//     float area = (2f * 3.14f * (radius * radius)) + (2f * 3.14f * radius * height); 
//     System.out.println("surface area of the cylinder is : " + area);
//   }
//   public void calcVolume() {
//     float vol = 3.14f * (radius * radius) * height; 
//     System.out.println("volume of the cylinder is : " + vol);
//   }
// }


// #3 use a constructor and repeat #1: 
class Cylinder {
  Scanner sc = new Scanner(System.in); 
  private float radius; 
  private float height; 

  // this iz constructor
  public Cylinder(float r, float h) {
    radius = r; 
    height = h; 
  }
  // setters lol: 
  public void setRadius() {
    System.out.print("set radius for the cylinder(in cm): ");
    radius = sc.nextFloat(); 
  }
  public void setHeight() {
    System.out.print("set height for the cylinder(in cm): ");
    height = sc.nextFloat();
  }
  // getters lol: 
  public void getRadius() {
    System.out.println("cylinder's radius that you set: " + radius + "cm");
  }
  public void getHeight() {
    System.out.println("cylinder's height that you set: " + height + "cm");
  }

  // methods here: 
  public void calcSurfaceArea() {
    float area = (2f * 3.14f * (radius * radius)) + (2f * 3.14f * radius * height); 
    System.out.println("surface area of the cylinder is : " + area);
  }
  public void calcVolume() {
    float vol = 3.14f * (radius * radius) * height; 
    System.out.println("volume of the cylinder is : " + vol);
  }
}


// #4 overload a constructor used to initiate a rectangle 














