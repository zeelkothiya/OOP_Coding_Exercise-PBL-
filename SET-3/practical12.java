//AIM
/*Write a Java program that demonstrates method overloading to calculate the volume of different
3D shapes. Implement overloaded methods named calculateVolume() for a Cube (takes one side
length), a RectangularCube (takes length, width, height), and a Sphere (takes radius). */

import java.util.Scanner;

class practicall2 {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    double calculateVolume(float r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        System.out.print("Enter side of cube: ");
        double s = sc.nextDouble();
        System.out.println("Cube Volume: " + v.calculateVolume(s));

        System.out.print("Enter length width height: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Rectangular Cube Volume: " + v.calculateVolume(l, w, h));

        System.out.print("Enter radius of sphere: ");
        float r = sc.nextFloat();
        System.out.println("Sphere Volume: " + v.calculateVolume(r));
    }
}
