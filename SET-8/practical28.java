//AIM
/*Write a Java program that reads a text file named data.txt. The program should count and display:
The total number of lines, The total number of words, The total number of characters (excluding
spaces and newline characters), Use FileReader / BufferedReader for reading the file. Handle
exceptions like FileNotFoundException and IOException. */

import java.io.*;

public class practical28 {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while((line = br.readLine()) != null) {
                lines++;

                String[] wordList = line.trim().split("\\s+");
                if(line.trim().length() > 0)
                    words += wordList.length;

                characters += line.replaceAll("\\s", "").length();
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters (excluding spaces): " + characters);

        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("Error reading file");
        }
    }
}
