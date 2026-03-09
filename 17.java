class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void area() {
        int a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
}

class Circle extends Shape {
    double r = 7;

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

        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Square s = new Square();

        r.area();
        c.area();
        s.area();
    }
}
