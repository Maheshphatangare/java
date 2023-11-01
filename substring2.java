import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Calculate the sum of the lengths of the two strings
        int lengthSum = A.length() + B.length();

        // Determine if A is lexicographically greater than B
        String lexicoResult = A.compareTo(B) > 0 ? "Yes" : "No";

        // Capitalize the first letter of both A and B
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print the results
        System.out.println(lengthSum);
        System.out.println(lexicoResult);
        System.out.println(A + " " + B);
    }
}
