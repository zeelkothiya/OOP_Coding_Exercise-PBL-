//AIM practical21
/*Write a Java program to create a class VotingApp where:
● The method checkEligibility(int age) checks if a person is eligible to vote.
● If age < 18, explicitly throw the predefined exception IllegalArgumentException with the
message "Age must be 18 or above to vote".
In the main method, test the method with different age inputs.
● Use a try-catch-finally block to handle exceptions.
● The finally block should always print "Validation process completed"*/

import java.util.Scanner;

class VotingApp {

    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp obj = new VotingApp();

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            obj.checkEligibility(age);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }
}
