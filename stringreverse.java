public class StringReverse {
    public static void main(String[] args) {
        String original = "Hello World";
        StringBuilder reversed = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }

        
        System.out.println("Reversed string: " + reversed.toString());
    }
}
