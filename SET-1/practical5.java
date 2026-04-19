//AIM
/*Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the
area of the triangle. Ensure that the program validates if the given side lengths can actually form a
triangle (sum of any two sides must be greater than the third side) before calculating the area (use
Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2). */

import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Check triangle validity
        if (a + b > c && a + c > b && b + c > a) {

            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("Area of triangle: %.2f\n", area);

        } else {
            System.out.println("Invalid triangle sides.");
        }
    }
}
