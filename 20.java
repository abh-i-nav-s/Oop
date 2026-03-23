import java.util.*;

public class ExceptionDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);
        } catch(ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        try {
            int arr[] = new int[3];

            System.out.print("Enter index (0-2): ");
            int i = sc.nextInt();

            System.out.print("Enter value: ");
            int val = sc.nextInt();

            arr[i] = val;
            System.out.println("Value stored successfully!");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        }
    }
}
