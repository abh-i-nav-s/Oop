import java.util.*;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r) { this.r = r; }

    public double area() { return Math.PI * r * r; }
    public double perimeter() { return 2 * Math.PI * r; }
}

class Rectangle implements Shape {
    double l, b;
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() { return l * b; }
    public double perimeter() { return 2 * (l + b); }
}

public class ShapeTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    System.out.println("Area = " + c.area());
                    System.out.println("Perimeter = " + c.perimeter());
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    Rectangle rec = new Rectangle(l, b);
                    System.out.println("Area = " + rec.area());
                    System.out.println("Perimeter = " + rec.perimeter());
                    break;
            }
        } while(ch != 3);
    }
}
