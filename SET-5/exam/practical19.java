import student.Student;
import java.util.*;

class Result extends Student {
    int marks1, marks2, marks3;

    Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

public class practical19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks3: ");
        int m3 = sc.nextInt();

        Result r = new Result(roll, name, m1, m2, m3);
        r.displayResult();
    }
}
