import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Square of the number
        int square = num * num;
        int sum = 0;

        // Sum of digits of the square
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        // Check condition
        if (sum == num) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is NOT a Neon number.");
        }

        sc.close();
    }
}
