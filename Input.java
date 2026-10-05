import java.util.*;
public class Input {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println("The sum is: " + sum);
        }
    }
}
