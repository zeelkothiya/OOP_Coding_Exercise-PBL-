//AIM
/*Write the Java code for an interface named Exam which declares a single abstract method boolean
isPassed(int mark). This method should take an integer mark as an argument. Write the Java code
for another interface named Classify which declares a single abstract method String
getDivision(double average). This method should take a double average as an argument. Create a
class named Result that implements both the Exam and Classify interfaces. Provide concrete
implementations for isPassed() and getDivision() methods. In your main method, create an
instance of Result, set some marks and average, and demonstrate the use of both interface
methods.*/

import java.util.Scanner;

interface Exam {
    abstract boolean isPassed(int mark);
}

interface Classify {
    abstract String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 40;
    }

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

public class practical17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        System.out.print("Enter average: ");
        double avg = sc.nextDouble();

        Result r = new Result();

        System.out.println("Passed: " + r.isPassed(mark));
        System.out.println("Division: " + r.getDivision(avg));
    }
}
