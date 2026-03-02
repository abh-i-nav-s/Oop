import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = (double) total / n;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);
    }
}
