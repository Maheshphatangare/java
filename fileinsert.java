


     

     
    

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) {
        // Replace "yourfile.txt" with the path to your text file
        String fileName = "C:\\Users\\mahesh\\OneDrive\\Desktop\\Exception.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)) ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

