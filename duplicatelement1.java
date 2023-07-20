import java.util.*;
class duplicatelement1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Integer[] arr = { 1,2, 6, 4, 2, 3, 3, 1, 7 };
       
         System.out.println("array having Dublicate"+ Arrays.toString(arr));
HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
 System.out.println("array NOT having Dublicate"+set);

    }
}
