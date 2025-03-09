package incubation.exceptionhandling;

import java.io.*;
//Handling Checked Exception
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

