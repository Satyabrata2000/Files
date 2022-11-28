package Files;

import java.io.FileWriter;
import java.io.IOException;

//write to a file
public class Example2 {

    public static void main(String[] args) {

        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
