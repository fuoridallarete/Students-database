package studentsDB;

import java.util.Scanner;

public class StudentsDBapp {
  public static void main(String[] args){
    //ask how many users you want to add
    System.out.print("Enter number of students to enroll: ");
    Scanner in = new Scanner(System.in);
    //create array of students (array of objects)
    int numOfStudents = in.nextInt();
    Student[] students = new Student[numOfStudents];
    //then we iterate through this array of objects of type Student
    for(int n = 0; n < numOfStudents; n++){
      students[n] = new Student();
      students[n].enroll();
      students[n].payTuition();
      System.out.println(students[n].toString());
    }
 }
} 
 
 
