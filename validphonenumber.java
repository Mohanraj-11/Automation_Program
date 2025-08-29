import java.util.Scanner;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        // Check if phone number has exactly 12 digits and starts with 91
        if (phone.matches("^91[0-9]{10}$")) {
            System.out.println("✅ Valid Phone Number");
        } else {
            System.out.println("❌ Invalid Phone Number");
        }

        sc.close();
    }
}
