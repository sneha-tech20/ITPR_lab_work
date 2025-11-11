// Import the Scanner class to take input from the user
import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();  // Read radius as a double value

        // Calculate area using the formula: π * r²
        double area = Math.PI * radius * radius;

        // Calculate perimeter (circumference) using the formula: 2 * π * r
        double perimeter = 2 * Math.PI * radius;

        // Display the area of the circle
        System.out.println("Area of the circle = " + area);

        // Display the perimeter of the circle
        System.out.println("Perimeter (Circumference) of the circle = " + perimeter);

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
} 
    

