package stringMethods;

public class StringManipulation {
	
	

	    // Method to reverse a string
	    public static String reverse(String str) {
	        char[] charArray = charArray(str);
	        String reversed = "";
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            reversed += charArray[i];
	        }
	        return reversed;
	    }

	    // Method to convert string to char array
	    public static char[] charArray(String str) {
	        char[] charArray = new char[str.length()];
	        for (int i = 0; i < str.length(); i++) {
	            charArray[i] = str.charAt(i);
	        }
	        return charArray;
	    }

	    // Method to convert string to upper case using .toUpperCase()
	    public static String toUpper(String str) {
	        return str.toUpperCase(); // Using inbuilt method
	    }

	    // Method to convert string to lower case using .toLowerCase()
	    public static String toLower(String str) {
	        return str.toLowerCase(); // Using inbuilt method
	    }

	    // Method to check if two strings are equal using .equals()
	    public static boolean equals(String str1, String str2) {
	        return str1.equals(str2); // Using inbuilt method
	    }

	    // Method to check if two strings are equal ignoring case using .equalsIgnoreCase()
	    public static boolean equalsIgnoreCase(String str1, String str2) {
	        return str1.equalsIgnoreCase(str2); // Using inbuilt method
	    }

	    // Method to get character at a specific index
	    public static char charAt(String str, int index) {
	        if (index < 0 || index >= str.length()) {
	            throw new StringIndexOutOfBoundsException("Index out of bounds");
	        }
	        return str.charAt(index); // Using charAt directly
	    }

	    // Method to count the number of characters in a string
	    public static int count(String str) {
	        int count = 0;
	        for (int i = 0; ; i++) {
	            try {
	                str.charAt(i); // Accessing characters until an exception is thrown
	                count++;
	            } catch (StringIndexOutOfBoundsException e) {
	                break; // Break the loop when the end of the string is reached
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String str = "Hello World";

	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reverse(str));
	        System.out.println("Upper Case: " + toUpper(str));
	        System.out.println("Lower Case: " + toLower(str));
	        System.out.println("Equals 'Hello World': " + equals(str, "Hello World"));
	        System.out.println("Equals Ignore Case 'hello world': " + equalsIgnoreCase(str, "hello world"));
	        System.out.println("Character at index 4: " + charAt(str, 4));
	        System.out.println("Character Count: " + count(str));
	    }
	}



