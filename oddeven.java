package stringMethods;

import java.util.Scanner;

public class oddeven {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the range
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        // Print odd numbers in the specified range
        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.print(i + " ");
            }
        }

        // Prompt user for a number to check if it's even or odd
        System.out.print("\n\nEnter a number to check if it is even or odd: ");
        int numberToCheck = scanner.nextInt();

        // Check if the number is even or odd
        if (numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is even.");
        } else {
            System.out.println(numberToCheck + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }
	}


