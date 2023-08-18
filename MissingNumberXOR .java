public class MissingNumberXOR {
    public static int findMissingNumber(int[] nums) {
        int xorTotal = 0;
        int xorArray = 0;
//original loop
        for (int i = 1; i <= nums.length + 1; i++) {
            xorTotal =xorTotal ^ i;
        }
// given Array
        for (int num : nums) {
            xorArray = xorArray ^ num;
        }
       // check condition
        return xorTotal ^ xorArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 6};
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
