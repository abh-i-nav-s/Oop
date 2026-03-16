class Area {

    double area(double r) {
        return 3.14 * r * r;
    }

    double area(double l, double b) {
        return l * b;
    }

    int area(int s) {
        return s * s;
    }

    public static void main(String args[]) {

        Area obj = new Area();

        System.out.println("Area of Circle = " + obj.area(5.0));
        System.out.println("Area of Rectangle = " + obj.area(4.0,6.0));
        System.out.println("Area of Square = " + obj.area(5));
    }
}
