//AIM
/*Develop a Java program that prompts the user to enter a distance in meters. 
Your program should then convert this distance to feet (1 meter = 3.28084 feet) and display the result formatted to two decimal places. */

import java.util.Scanner;

public class practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        double feet = meters * 3.28084;

        System.out.printf("%.2f meter Distance in feet: %.2f\n",meters,feet);
    }
}
