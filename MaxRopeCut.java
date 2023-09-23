public class MaxRopeCut {
//hii
    // Function to find the maximum number of pieces
    // that can be obtained from a rope of length n
    public static int maxPieces(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }

        int max1 = maxPieces(n - a, a, b, c);
        int max2 = maxPieces(n - b, a, b, c);
        int max3 = maxPieces(n - c, a, b, c);

        int max = Math.max(max1, Math.max(max2, max3));

        if (max == -1) {
            return -1;
        }

        return max + 1;
    }

    public static void main(String[] args) {
        int n = 5; // Length of the rope
        int a = 2; // Length of the first cut
        int b = 5; // Length of the second cut
        int c = 1; // Length of the third cut

        int maxPieces = maxPieces(n, a, b, c);

        if (maxPieces == -1) {
            System.out.println("The rope cannot be cut into pieces.");
        } else {
            System.out.println("Maximum pieces that can be obtained: " + maxPieces);
        }
    }
}
