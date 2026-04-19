//AIM practical-8
/*Create a Point class representing a 2D point (x, y). Implement a default constructor that initializes
both x and y to 5. Provide a parameterized constructor to initialize x and y with user-supplied
values. Also, implement a copy constructor to create a new Point object as a copy of an existing
Point object. Include a display() method to show the point's coordinates and write a main method
to test all constructors and the display functionality. */

import java.util.Scanner;

class Point {
    int x, y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        Point p1 = new Point();
        Point p2 = new Point(x, y);
        Point p3 = new Point(p2);

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("Parameterized Constructor:");
        p2.display();

        System.out.println("Copy Constructor:");
        p3.display();
    }
}
