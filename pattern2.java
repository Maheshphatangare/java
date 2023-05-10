import java.util.*;

public class pattern2 {
	// Function to demonstrate pattern


	// Driver Function
	public static void main(String args[])
	{
	 for (int i = 5; i >= 1; i--) {
  
            // inner loop to handle columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
  
            // printing new line for each row
            System.out.println("");
        }
    }
	}
 // *****
 // ****
 // ***
 // **
//  *
