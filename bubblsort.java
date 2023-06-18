import java.util.*;
class bubblsort{
    public static void main(String[] args) {
        int arr[]={19,12,83,14,5,46,47,68,89,10};
       // Scanner sc=new Scanner(System.in);
       
       System.out.println("array before short:"+ Arrays.toString(arr));
       
      //  int key= sc.nextInt();
       int n = arr.length;
       for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
               if (arr[j] > arr[j + 1]) {
                   // Swap array[j] and array[j+1]
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
        
        
        System.out.println("after shorting arr"+Arrays.toString(arr));
        
    }
