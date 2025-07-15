package stringMethods;

public class Multiplication {
	
	public static void main(String[] args) {
		
	

	 int number = 5; // The number for which the multiplication table will be generated
     int range = 10; // The range for the multiplication table
     // Display the multiplication table
     System.out.println("Multiplication Table for " + number + ":");
     
     // Using a for loop to generate the multiplication table
     for (int i = 1; i <= range; i++) {
         // Calculate the result of the multiplication
         int result = number * i;
         // Print the multiplication statement
         System.out.printf("%d x %d = %d\n", number, i, result);
     }
	
}
}
