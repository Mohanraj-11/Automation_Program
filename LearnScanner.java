package stringMethods;

import java.util.Scanner;

public class LearnScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt user for weight
        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        // Prompt user for height
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine the BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        // Display the results
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("BMI Category: " + category);

        // Close the scanner
        scanner.close();
    }

	}


