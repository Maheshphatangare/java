import java.util.Scanner;
//max min from  Arrayhiiii
public class MaxMinFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");

        // Input loop
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // Finding the maximum and minimum values
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Outputting the results
        System.out.println("Maximum value in the array is:\t " + max);
        System.out.println("Minimum value in the array is: " + min);
    }
}
