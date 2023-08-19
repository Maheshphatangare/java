public class TwoOddOccurringNumbersXOR {
    public static void findTwoOddOccurring(int[] nums) {
        int xorResult = 0;

        // XOR all elements of the array
        for (int num : nums) {
            xorResult = xorResult ^num;
        }

        // Find the rightmost set bit in the XOR result
        int rightmostSetBit = xorResult & -xorResult;

        int oddOccurring1 = 0;
        int oddOccurring2 = 0;

        // Separate elements into two groups based on the rightmost set bit
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                oddOccurring1 =oddOccurring1 ^ num;
            } else {
                oddOccurring2 = oddOccurring2 ^ num;
            }
        }

        System.out.println("The two odd-occurring numbers are: " + oddOccurring1 + " and " + oddOccurring2);
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 6, 2, 5, 5, 7};
        findTwoOddOccurring(nums);
    }
}
