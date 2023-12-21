import java.util.ArrayList;
import java.util.Scanner;
 
public class ConvertUserArrayToArrayList {
    public static void main(String[] args) {
        // Take input from the user to create an array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] userArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }
        
        // Convert userArray to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int element : userArray) {
            arrayList.add(element);
        }
        
        // Printing the ArrayList
        System.out.println("ArrayList: " + arrayList);
        
        scanner.close();
    }
}
