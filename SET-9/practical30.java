//AIM
/*Write a program that accepts a sentence from the user and counts the frequency of each word using
a HashMap<String, Integer>. Display the results in the format:
Input: "Java is fun and Java is powerful"
Output:
Java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1 */

import java.util.*;

public class practical30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = input.split(" ");

        for(String word : words) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Word Frequency:");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
