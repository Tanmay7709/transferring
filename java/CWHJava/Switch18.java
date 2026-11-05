import java.util.*; 

public class Switch18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    // System.out.println("switch statements from here: ");
    // System.out.print("enter something between(0-4): ");
    // int a = sc.nextInt(); 
    // switch(a) {
    //   case 0: 
    //     System.out.println("u entered zero oke");
    //     break; 
    //   case 1: 
    //     System.out.println("u entered one oke");
    //     break; 
    //   case 2: 
    //     System.out.println("u entered two oke");
    //     break; 
    //   case 3: 
    //     System.out.println("u entered three oke");
    //     break; 
    //   case 4: 
    //     System.out.println("u entered four oke");
    //     break; 
    //   default: 
    //     System.out.println("u didnt enter anything between 0 to 4");
    // }
    
    // // this is enhanced switch statements which do not need a break statement and they break once they find a case thats true; 
    // System.out.println("this will be an example of enhances switch statement");
    // System.out.print("(enhanced)enter something between(0-5): ");
    // int b = sc.nextInt(); 
    // switch(b) {
    //   case 0 -> System.out.println("hey hey");
    //   case 1 -> System.out.println("this one");
    //   case 2 -> System.out.println("this two");
    //   case 3 -> System.out.println("this three");
    //   case 4 -> {
    //     System.out.println("this four");
    //     System.out.println("this will use more lines of code and different format");
    //   }
    //   case 5 -> {
    //     System.out.println("this five and it will use more lines of code aswell");
    //     System.out.println("it uses a different format for using more then one lines for commanding the code");
    //   }
    //   default -> System.out.println("oi");






    // practice questions : 

    // // Q1 : what will it print? 
    // a = 11; 
    // if(a = 11) {
    //   System.out.println("I am 11");
    // } else {
    //   System.out.println("I am not 11");
    // }
    // // my ans was else but i didnt pay attention that much
    // // real ans: it will throw an error due to that assignment operator used in if statement


    // // Q2 : write a program to find out whether a student is pass or fail : if it requires total 40% and at least 33% in each subject to pass assume 3 subjects and take marks as an input from the user 
    // System.out.print("Enter marks for subject 1: ");
    // int sub1 = sc.nextInt(); 
    // System.out.print("Enter marks for subject 2: ");
    // int sub2 = sc.nextInt(); 
    // System.out.print("Enter marks for subject 3: ");
    // int sub3 = sc.nextInt(); 
    // int total = (sub1 + sub2 + sub3) / 3; 
    // if(sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && total >= 40) {
    //   System.out.println("you are pass in all subjects(sori for bad enlish i is no gud much) ");
    //   System.out.println("your score in percentage : " + total);
    // } else {
    //   System.out.println("you have been failed due to the conditions set for passing the exam as a whole ");
    //   System.out.println("your score in percentage : " + total);
    // }
    // //  use a float value for calculating the accurate percentage otherwise rest is oke
    // // to use float replace 3 with 3.0f 


    // // Q3 : calculate income tax paid by an employee to the government as per the slabs mentioned below : 
    // // income slabs     Tax 
    // // 2.5L - 5.0L      5% 
    // // 5.0L - 10.0L     20%
    // // Above 10L        30%
    // System.out.print("enter your annual income in lakhs : ");
    // float tax = sc.nextFloat();
    // float taxLakh = tax * 100000; 
    // if(tax <= 2.5) {
    //   System.out.println("you do not have to pay taxes *yet*");
    // } else if(tax > 2.5 && tax <= 5.0) {
    //   System.out.println("you have to pay 5% tax from your annual income");
    //   System.out.println("your annual income : " + taxLakh);
    //   System.out.println("ammount you have to pay as tax : " + taxLakh * 0.05f);
    // } else if(tax > 5.0 && tax <= 10.0) {
    //   System.out.println("you have to pay 20% tax from your annual income");
    //   System.out.println("your annual income : " + taxLakh);
    //   System.out.println("ammount you have to pay as tax : " + taxLakh * 0.20f);
    // } else if(tax > 10.0) {
    //   System.out.println("your have topay 30% of your annual income");
    //   System.out.println("your annual income : " + taxLakh);
    //   System.out.println("ammount you have to pay as tax : " + taxLakh * 0.30f);
    // } else {
    //   System.out.println("some error occured try entering the input again ");
    // }

    
    // // Q4 : write a java program to find out the day of the week given the number [1 for monday, 2 for tuesday...]
    // System.out.print("enter a number based on the week (1-7(mon-sun)): ");
    // int num = sc.nextInt(); 
    // switch(num) {
    //   case 1 -> System.out.println("its monday");
    //   case 2 -> System.out.println("its cheuwsday ain it");
    //   case 3 -> System.out.println("its wednesday");
    //   case 4 -> System.out.println("its thursday");
    //   case 5 -> System.out.println("its friday");
    //   case 6 -> System.out.println("its saturday");
    //   case 7 -> System.out.println("its sunday");
    //   default -> System.out.println("enter a number between 1 to 7 only");
    // }


    // // Q5 : write a java program to find weather a year entered by the user is a leap year or not
    // System.out.print("enter a year to see if its leap year or not: ");
    // int year = sc.nextInt(); 
    // if(year % 4 == 0) {
    //   System.out.println("its a leap year");
    // } else {
    //   System.out.println("its not a leap year");
    // }


    // // Q6 : write a program to find out the type of website from the url: 
    // // .com -> commertial website
    // // .org -> organizatio website
    // // .in  -> indian website?? wot did .in meant indian websites?? i didnt knew that
    // System.out.print("enter a website's url: ");
    // String url = sc.next();
    // if(url.endsWith(".com")) {
    //   System.out.println("its a commertial website");
    // } else if(url.endsWith(".org")) {
    //   System.out.println("its a organization website");
    // } else if(url.endsWith(".in")) {
    //   System.out.println("its an indian website");
    // } else if(url.endsWith(".gov")) {
    //   System.out.println("its a government website");
    // } else if(url.endsWith(".net")) {
    //   System.out.println("its a technology firm / web hosting providers website");
    // } else {
    //   System.out.println("enter a proper 'website' url because we only recognize ts(eg. .com/.org/.in/.gov/.net/)");
    // }

    // i used indexOf instead of endsWith so i was just seeing if it has some piece of website in it somewhere before or after but somewhere in the url so it was inaccurate but in video the smart guy used the approach that he told in the question which i didnt pay attention to which was my mistake... 

    
  }
}
