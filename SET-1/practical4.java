//AIM
/*Develop a Java application that calculates a person's Body Mass Index (BMI). The program should ask the user for their weight in pounds and height in inches. Convert these values to kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and then calculate BMI (weight in kg / (height in meters)^2). Display the calculated BMI.*/

import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        double weightKg = pounds * 0.45359237;
        double heightM = inches * 0.0254;

        double bmi = weightKg / (heightM * heightM);

        System.out.printf("BMI = %.2f\n", bmi);
    }
}
