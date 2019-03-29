package studentsDB;

import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private String courses = null;
  private int gradeYear;
  private String studentId;
  private int tuitionBalance = 0;
  private static int costOfCourse = 600;
  private static int id = 1000;
  //constructor
  public Student() {
    //prompt user to enter name and year
    Scanner in = new Scanner(System.in);
    System.out.println("Enter student first name: ");
    this.firstName = in.nextLine();
    System.out.println("Enter student last name: ");
    this.lastName = in.nextLine();
    System.out.println("1 - freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n" +
        "Enter student grade level: ");
    this.gradeYear = in.nextInt();
    setStudentId();
    System.out.println("Name: " + firstName + " Last Name: " + lastName + " Grade Year: " + gradeYear + " Student ID: " + studentId);

  }
  //generate a 5-digit unique ID - not random but a static one
  private void setStudentId() {
    //grade level + id
    id++;
    this.studentId = gradeYear + "" + id;
    // adding "" makes it a string not an int
  }
  //enroll in courses
  public void enroll(){
    //get inside a loop and user hits 0 to enroll
    do {
      System.out.print("Enter course to enroll (Q to quit): ");
      Scanner in = new Scanner(System.in);
      String course = in.nextLine();
      if (!course.equals("Q")) {
        courses = courses + "\n" + course;
        tuitionBalance = tuitionBalance + costOfCourse;
      }else {
        break;
      }
    }while(1 != 0);

    System.out.println("Enrolled in " + courses);
  }
  //view balance
  public void viewBalance(){
    System.out.println("Your balance is " + tuitionBalance);
  }
  //pay tuition
  public void payTuition(){
    viewBalance();
    System.out.print("Enter your payment: $");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
    tuitionBalance = tuitionBalance - payment;
    System.out.println("Thank you for your payment of " + payment);
    viewBalance();
  }
  //show student' status
 } 
