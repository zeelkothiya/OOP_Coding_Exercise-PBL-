//AIM
/* Create a file named students.txt. Write at least three student records (roll number, name, marks)
into the file. Read the file content and display all student records on the console. Handle
exceptions like IOException properly using try-catch-finally. */

import java.io.*;

public class practical27{
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");

            fw.write("101 Kesha 85\n");
            fw.write("102 Smira 90\n");
            fw.write("103 Ania 78\n");

            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(br != null)
                    br.close();
            } catch(IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
