import java.util.Arrays;
//permutation
public class Permutations {
     public static void Per(char[] arr, int fi) {
        if (fi == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = fi; i < arr.length; i++) {
            swap(arr, fi, i);
            Per(arr, fi + 1);
            swap(arr, fi, i);
        }
    }

    public static void swap(char[] arr, int i, int j) {
       char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        String arr = "abc"; // Replace with your desired array
        Per(arr.toCharArray(), 0);
    }
}
   
