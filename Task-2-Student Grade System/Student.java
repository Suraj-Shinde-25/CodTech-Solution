import java.util.Scanner;

/* TASK 3
Student Grade Management System: Design a program that can store student
information (name, roll number,subject marks) and calculate their overall totalMarks
and grade based on pre-defined grade criteria. Include the ability to add, update, and
delete student records */

/**
 * Student
 */
class StudentInfo{
    public String name;
    public int rollNo;
    public double totalMarks;
    public double percentage;
    public double[] marks = new double[5];


    Scanner sc = new Scanner(System.in);
    public void getName() {
        System.out.println("Enter the Name :");
        name = sc.nextLine();
        System.out.println("------------------------");
    }
    public void getRollNo() {
        System.out.println("Enter the Roll no :");
        rollNo = sc.nextInt();
        System.out.println("------------------------");
    }
    public void getMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter subject "+(i+1)+" marks :");
            marks[i] = sc.nextDouble();
        }
        System.out.println("------------------------");
    }
    public void calculateTotalMarks() {
        for (int i = 0; i < marks.length; i++) {
            totalMarks = marks[i] + totalMarks;
        }
    }
    public void calculatePercentage() {
        percentage = (totalMarks/500)*100;
    }
    public void showStudeInfo() {
        System.out.println("----------------------------");
        System.out.println("Student Name :"+name);
        System.out.println("Student Roll no :"+rollNo);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject "+(i+1)+" Mark :"+ marks[i]);
        }
        System.out.println("Total Marks :"+(int)totalMarks);
        System.out.println("Percentage :"+percentage);
        System.out.println("----------------------------");
    }
    public void checkGrade() {
        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Student is in 'A+' Grade");
        } else if(percentage >= 80 && percentage < 90) {
            System.out.println("Student is in 'A' Grade");
        } else if(percentage >= 70 && percentage < 80) {
            System.out.println("Student is in 'B' Grade");
        } else if(percentage >= 60 && percentage < 70) {
            System.out.println("Student is in 'C' Grade");
        } else if(percentage >= 50 && percentage < 60) {
            System.out.println("Student is in 'D' Grade");
        } else if(percentage >= 35 && percentage < 50) {
            System.out.println("Student is in 'E' Grade");
        } else if(percentage < 35) {
            System.out.println("Student are Failed");
        }
    }
}
public class Student {

    public static void main(String[] args) {
        StudentInfo obj = new StudentInfo();
        obj.getName();
        obj.getRollNo();
        obj.getMarks();
        obj.calculateTotalMarks();
        obj.calculatePercentage();
        obj.showStudeInfo();
    }
}