public class PalindromeRecursion {

    public static boolean isPalindrome(String str) {
        // Base case: if the string has 0 or 1 character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }
        
        // Compare the first and last characters
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        
        if (firstChar != lastChar) {
            return false; // Not a palindrome
        } else {
            // Recursive case: Check if the substring excluding the first and last characters is a palindrome
            String substring = str.substring(1, str.length() - 1);
            return isPalindrome(substring);
        }
    }

    public static void main(String[] args) {
        String input = "racecar"; // Change this to the string you want to check
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
