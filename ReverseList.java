import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an empty ArrayList to store the strings
        List<String> strings = new ArrayList<>();
        
        // Prompt the user to enter the strings
        System.out.println("Enter strings (one per line), then press Enter:");
        
        // Read the strings from the user and add them to the ArrayList
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            // Stop reading input if the user enters an empty line
            if (input.isEmpty()) {
                break;
            }
            
            strings.add(input);
        }
        
        // Reverse the order of the elements in the ArrayList
        Collections.reverse(strings);
        
        // Print the reversed list to the console
        System.out.println("Reversed list:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
