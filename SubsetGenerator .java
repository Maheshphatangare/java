public class SubsetGenerator {
    public static void generateSubsets(String s) {
        generateSubsetsHelper(s, 0, "");
    }

    private static void generateSubsetsHelper(String s, int index, String currentSubset) {
        // Base case: When the current index reaches the length of the input string
        if (index == s.length()) {
            System.out.println(currentSubset);
            return;
        }

        // Include the character at the current index in the currentSubset
        generateSubsetsHelper(s, index + 1, currentSubset + s.charAt(index));

        // Exclude the character at the current index from the currentSubset
        generateSubsetsHelper(s, index + 1, currentSubset);
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Subsets of \"" + input + "\":");
        generateSubsets(input);
    }
}
