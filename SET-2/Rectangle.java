//AIM practical-6
/*Define a Java class named Rectangle. It should have two double data fields: width and height, both
with a default value of 1. Implement a no-argument constructor and a constructor that takes width
and height as parameters. Include methods getArea() and getPerimeter() that return the calculated
area and perimeter respectively. */

import java.util.Scanner;

class Rectangle {
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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Rectangle r = new Rectangle(w, h);

        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
