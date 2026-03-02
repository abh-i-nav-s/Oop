import java.util.*;

class Employee {
    int eNo;
    String eName;
    double salary;

    void read(Scanner sc) {
        eNo = sc.nextInt();
        eName = sc.next();
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println(eNo + " " + eName + " " + salary);
    }
}

public class EmpSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            e[i].read(sc);
        }

        int key = sc.nextInt();
        boolean found = false;

        for (Employee emp : e) {
            if (emp.eNo == key) {
                emp.display();
                found = true;
            }
        }

        if (!found)
            System.out.println("Employee not found");
    }
}
