public class StringPalindrome {
    public static void main(String[] args) {
        String original = "Madam"; // Change this string to test other values
        String reversed = "";

        // Reverse the string using charAt
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check if original and reversed strings are equal (case-insensitive)
        if (original.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println(original + " is a palindrome string.");
        } else {
            System.out.println(original + " is not a palindrome string.");
        }
    }
}
