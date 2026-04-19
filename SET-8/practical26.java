//AIM
/*Write a program that will count the number of characters, words, and lines in a file. Words are
separated by whitespace characters. The file name should be passed as a command-line argument. */

import java.io.*;

public class practical26 {
    public static void main(String[] args) {
        int characters = 0, words = 0, lines = 0;

        if(args.length == 0) {
            System.out.println("Please provide file name as command-line argument");
            return;
        }

        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null) {
                lines++;

                String[] wordList = line.trim().split("\\s+");
                if(line.trim().length() > 0)
                    words += wordList.length;

                characters += line.length();
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
