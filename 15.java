import java.util.*;

class Employee {
    int eNo;
    String eName;
    double salary;

    Employee(int eNo, String eName, double salary) {
        this.eNo = eNo;
        this.eName = eName;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String dept;
    String subject;

    Teacher(int eNo, String eName, double salary, String dept, String subject) {
        super(eNo, eName, salary);
        this.dept = dept;
        this.subject = subject;
    }

    void display() {
        System.out.println(eNo + " " + eName + " " + salary + " " + dept + " " + subject);
    }
}

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            int eNo = sc.nextInt();
            String eName = sc.next();
            double salary = sc.nextDouble();
            String dept = sc.next();
            String subject = sc.next();

            t[i] = new Teacher(eNo, eName, salary, dept, subject);
        }

        for (Teacher teacher : t)
            teacher.display();
    }
}
