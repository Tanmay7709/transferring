public class One2 {
  public static void main(String[] args) {
  Employee em1 = new FullTimeEmployee("shyam", 500.0); 
  Employee em2 = new PartTimeEmployee("baburao", 100.0, 5.0);

  em1.displayDetails(); 
  em2.displayDetails(); 
  }
}
// defining the interface : this must be the upperlevel class others
interface Employee {
  double calcSalary(); 
  void displayDetails(); 
} 
class FullTimeEmployee implements Employee {
  private String name; 
  private double monthlySalary; 

  public FullTimeEmployee(String name, double monthlySalary) {
    this.name = name; 
    this.monthlySalary = monthlySalary; 
  }

  @Override 
  public double calcSalary() {
    return monthlySalary; 
  }
  @Override 
  public void displayDetails() {
    System.out.println("Employee name: " + name);
    System.out.println("Employee salary: " + monthlySalary);
  }
}
class PartTimeEmployee implements Employee {
  private String name; 
  private double hourlyRate; 
  private double hoursWorked; 

PartTimeEmployee(String name, double hourlyRate, double hoursWorked) {
  this.name = name; 
  this.hourlyRate = hourlyRate; 
  this.hoursWorked = hoursWorked; 
}

  @Override
  public double calcSalary() {
    return hoursWorked * hourlyRate; 
  }

  @Override
  public void displayDetails() {
    System.out.println("Employee name: " + name);
    System.out.println("hours worked: " + hoursWorked);
    System.out.println("hour's rate: " + hourlyRate);
  }
}