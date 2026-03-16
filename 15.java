import java.util.Scanner;

class Employee {

    int empid;
    String name;
    double salary;

}

class Teacher extends Employee {

    String department;
    String subject;

    void read() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter Department: ");
        department = sc.next();

        System.out.print("Enter Subject: ");
        subject = sc.next();
    }

    void display() {

        System.out.println("ID: "+empid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
        System.out.println("Subject: "+subject);
    }
}

public class TeacherDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();

        Teacher t[] = new Teacher[n];

        for(int i=0;i<n;i++) {
            t[i] = new Teacher();
            t[i].read();
        }

        for(int i=0;i<n;i++) {
            t[i].display();
        }
    }
}
