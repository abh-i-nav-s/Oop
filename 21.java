import java.util.*;

class NegativeException extends Exception {
    NegativeException(String msg) {
        super(msg);
    }
}

public class AvgNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        double sum = 0;

        for(int i=0; i<n; i++) {
            try {
                System.out.print("Enter number " + (i+1) + ": ");
                int num = sc.nextInt();

                if(num < 0)
                    throw new NegativeException("Negative numbers not allowed!");

                sum += num;

            } catch(NegativeException e) {
                System.out.println(e.getMessage());
                i--; // retry same input
            }
        }

        System.out.println("Average = " + (sum / n));
    }
}
