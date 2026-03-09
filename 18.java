abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    int length = 8;
    int breadth = 4;

    void area() {
        int a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
}

class Circle extends Shape {
    double r = 5;

    void area() {
        double a = 3.14 * r * r;
        System.out.println("Area of Circle = " + a);
    }
}

class Square extends Shape {
    int side = 6;

    void area() {
        int a = side * side;
        System.out.println("Area of Square = " + a);
    }
}

public class Main {
    public static void main(String args[]) {

        Shape r = new Rectangle();
        Shape c = new Circle();
        Shape s = new Square();

        r.area();
        c.area();
        s.area();
    }
}
