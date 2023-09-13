public class JosephusProblem {

    public static int findSafePosition(int n, int k) {
        if (n == 1) {
            return 0; // The safe position when there's only one person is 0.
        } else {
            // Recursively find the safe position for n-1 people
            int safePosition = findSafePosition(n - 1, k);
            
            // Adjust the safe position to account for the circular nature of the problem
            return (safePosition + k) % n;
        }
    }

    public static void main(String[] args) {
        int n = 7;  // Total number of people
        int k = 3;  // Count every kth person for elimination

        int safePosition = findSafePosition(n, k) + 1; // Adding 1 to convert from 0-based to 1-based indexing
        System.out.println("The safe position is: " + safePosition);
    }
}
