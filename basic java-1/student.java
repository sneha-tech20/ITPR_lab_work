// Import the Scanner class for taking user input
import java.util.Scanner;

// Define a class named Student
class Student {
    // Declare variables for student details
    String name;
    int age;
    String standard;
    int rollNumber;

    // Constructor to initialize the student details
    Student(String name, int age, String standard, int rollNumber) {
        this.name = name;           // Assign parameter value to class variable
        this.age = age;             // Assign age
        this.standard = standard;   // Assign standard (class)
        this.rollNumber = rollNumber; // Assign roll number
    }

    // Method to display the student details
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);          // Print name
        System.out.println("Age: " + age);            // Print age
        System.out.println("Standard: " + standard);  // Print class/standard
        System.out.println("Roll Number: " + rollNumber); // Print roll number
    }

    // Main method — program execution starts here
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for name
        System.out.print("Enter student name: ");
        String name = sc.nextLine(); // Read string input

        // Ask user for age
        System.out.print("Enter age: ");
        int age = sc.nextInt();      // Read integer input

        sc.nextLine(); // Consume leftover newline (important after nextInt)

        // Ask user for standard/class
        System.out.print("Enter standard/class: ");
        String standard = sc.nextLine(); // Read string input

        // Ask user for roll number
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();   // Read integer input

        // Create a Student object using the constructor
        Student s1 = new Student(name, age, standard, rollNumber);

        // Call the display() method to show details
        s1.display();

        // Close the Scanner
        sc.close();
    }
}
