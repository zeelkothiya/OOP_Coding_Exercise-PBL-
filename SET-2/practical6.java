//AIM
/*Define a Java class named Rectangle. It should have two double data fields: width and height, both
with a default value of 1. Implement a no-argument constructor and a constructor that takes width
and height as parameters. Include methods getArea() and getPerimeter() that return the calculated
area and perimeter respectively. */

class practical6 {
    double width = 1;
    double height = 1;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle 2 Area: " + r2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + r2.getPerimeter());
    }
}
