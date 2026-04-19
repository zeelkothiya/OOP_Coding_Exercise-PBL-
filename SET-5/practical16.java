//AIM
/*Given an interface Classify with a method String getDivision(double average). Implement this
getDivision method in a class Result such that it returns "First Division" if the average is 60 or
more.*/

import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else if (average >= 50)
            return "Second Division";
        else if (average >= 40)
            return "Third Division";
        else
            return "Fail";
    }
}

public class practical16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average: ");
        double avg = sc.nextDouble();

        Result r = new Result();
        System.out.println("Division: " + r.getDivision(avg));
    }
}
