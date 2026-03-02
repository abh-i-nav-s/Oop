class Area {

    double area(double l, double b) {
        return l * b;
    }

    double area(double a) {
        return a * a;
    }

    double area(int r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Area obj = new Area();

        System.out.println("Rectangle: " + obj.area(5, 4));
        System.out.println("Square: " + obj.area(3));
        System.out.println("Circle: " + obj.area(2));
    }
}
