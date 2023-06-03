import java.io.*;
import java.util.*;  
class wavearr
{
    /* Function to swap two numbers.*/
    void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
 
    //* Function to sort array in wave form, i.e., arr[0] >= arr[1] <= arr[2].....*/
    void waveArray(int arr[], int n){
        // Sorting
        Arrays.sort(arr);
        // Swapping
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
 
    /*Driver code*/ 
    public static void main(String args[]){
        int size = 7;  
		int[] arr = {7, 7, 11, 3, 4, 5, 15};  
		System.out.print("Input array elements: ");  
		for(int i=0; i<size; i++){
		    System.out.print(arr[i] + " ");
		}  
		System.out.println();
        Main wave = new Main();
        wave.waveArray(arr, size);
        System.out.print("The wave array will be: ["); 
        int i;
        for(i=0; i<size-1; i++)
            System.out.print(arr[i] + ", ");
        System.out.println(arr[i] + "]");
    }
}
