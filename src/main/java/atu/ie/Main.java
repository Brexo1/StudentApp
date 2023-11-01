package atu.ie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare variables for user input
        String firstName;
        String Name3, Email3, Course3;
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create instances of the Student class
        Student user1 = new Student();

        // Prompt the user to enter the first name and set it in user1
        System.out.print("Enter First Name for user1: ");
        user1.setStudentName(scanner.nextLine());

        // Prompt the user to enter the email and set it in user1
        System.out.print("Enter Email for user1: ");
        user1.setStudentEmail(scanner.nextLine());

        // Prompt the user to enter the course name and set it in user1
        System.out.print("Enter Course Name for user1: ");
        user1.setCourseName(scanner.nextLine());

        // Prompt the user to enter the first name and store it in the 'firstName' variable
        System.out.print("Enter First Name for user2: ");
        firstName = scanner.nextLine();

        // Create a new instance of the Student class for user2 with 'firstName'
        Student user2 = new Student(firstName);

        // Prompt the user to enter the email and set it in user2
        System.out.print("Enter Email for user2: ");
        user2.setStudentAEmail(scanner.nextLine());

        // Prompt the user to enter the course name and set it in user2
        System.out.print("Enter Course Name for user2: ");
        user2.setCourseAName(scanner.nextLine());

        // Prompt the user to enter the first name and store it in 'Name3'
        System.out.print("Enter First Name for user3: ");
        Name3 = scanner.nextLine();

        // Prompt the user to enter the email and store it in 'Email3'
        System.out.print("Enter Email for user3: ");
        Email3 = scanner.nextLine();

        // Prompt the user to enter the course name and store it in 'Course3'
        System.out.print("Enter Course Name for user3: ");
        Course3 = scanner.nextLine();

        // Create a new instance of the Student class for user3 with 'Name3', 'Email3', and 'Course3'
        Student user3 = new Student(Name3, Email3, Course3);

        // Call the displayInfo method for user1 to display the entered information
        user1.displayInfo();

        // Call the displayInfoA method for user2 to display the entered information
        user2.displayInfoA();

        // Call the displayInfoC method for user3 to display the entered information
        user3.displayInfoC();

        // Close the scanner to release resources
        scanner.close();
    }
}
