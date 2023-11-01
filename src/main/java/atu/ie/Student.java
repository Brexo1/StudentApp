package ie.atu;

import java.util.Scanner;

public class Student {
    // Define private fields to store student information
    private String studentName;
    private String studentEmail;
    private String courseName;
    private String studentAName;
    private String studentAEmail;
    private String courseAName;
    private String studentCName;
    private String studentCEmail;
    private String courseCName;

    // Setters to assign values to the fields for the first student
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getters to retrieve values from the fields for the first student
    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getCourseName() {
        return courseName;
    }

    // Constructor with default values for the first student
    public Student() {
        this.studentName = "DefaultName";
        this.studentEmail = "DefaultEmail@atu.ie";
        this.courseName = "DefaultCourse";
    }

    // Constructor with a single argument for the second student
    public Student(String studentAName) {
        this.studentAName = studentAName;
    }

    // Setters and getters for the second student (studentAName)
    public void setStudentAEmail(String studentAEmail) {
        this.studentAEmail = studentAEmail;
    }

    public void setCourseAName(String courseAName) {
        this.courseAName = courseAName;
    }

    public String getStudentAEmail() {
        return studentAEmail;
    }

    public String getCourseAName() {
        return courseAName;
    }

    // Constructor with three arguments for the third student
    public Student(String studentCName, String studentCEmail, String courseCName) {
        this.studentCName = studentCName;
        this.studentCEmail = studentCEmail;
        this.courseCName = courseCName;
    }

    // Method to display information for the first student
    public void displayInfo() {
        System.out.println("\nStudent Name: " + getStudentName() + "\nStudent Email: " + getStudentEmail() + "\nCourse Name: " + getCourseName());
    }

    // Method to display information for the second student
    public void displayInfoA() {
        System.out.println("\nStudent Name: " + studentAName + "\nStudent Email: " + getStudentAEmail() + "\nCourse Name: " + getCourseAName());
    }

    // Method to display information for the third student
    public void displayInfoC() {
        System.out.println("\nStudent Name: " + studentCName + "\nStudent Email: " + studentCEmail + "\nCourse Name: " + courseCName);
    }
}

