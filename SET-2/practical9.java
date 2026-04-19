//AIM practical-9
/*Define a Java class named Rectangle. It should have two double data fields: width and height. In
your main method, create two Rectangle objects: one with width 4 and height 40, and another with
width 3.5 and height 35.9. For each rectangle, display its width, height, calculated area, and
perimeter. Then, compare the two rectangles based on their areas and print which one has a larger
area. */

import java.util.Scanner;

class practical9 {
    double width, height;

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

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width and height for Rectangle 1: ");
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();

        System.out.print("Enter width and height for Rectangle 2: ");
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();

        Rectangle r1 = new Rectangle(w1, h1);
        Rectangle r2 = new Rectangle(w2, h2);

        r1.display();
        r2.display();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}
