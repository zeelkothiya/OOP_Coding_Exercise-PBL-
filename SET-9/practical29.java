//AIM
/*Write a Java program that uses an ArrayList<Integer> to store marks of students. Perform the
following operations:
● Add at least 5 marks.
● Display all marks.
● Find and display the highest and lowest marks using Collections.max() and Collections.min(). */

import java.util.*;

public class practical29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter 5 marks:");
        for(int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("Marks:");
        for(int m : marks) {
            System.out.println(m);
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
