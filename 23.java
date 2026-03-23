import java.util.*;

class Fibonacci implements Runnable {
    int n;
    Fibonacci(int n) { this.n = n; }

    public void run() {
        int a = 0, b = 1;
        System.out.println("\nFibonacci Series:");
        for(int i=0; i<n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

class Even implements Runnable {
    int start, end;

    Even(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        System.out.println("\nEven numbers in range:");
        for(int i=start; i<=end; i++) {
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

public class ThreadDemo2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Fibonacci terms: ");
        int n = sc.nextInt();

        System.out.print("Enter start of range: ");
        int s = sc.nextInt();

        System.out.print("Enter end of range: ");
        int e = sc.nextInt();

        Thread t1 = new Thread(new Fibonacci(n));
        Thread t2 = new Thread(new Even(s, e));

        t1.start();
        t2.start();
    }
}
