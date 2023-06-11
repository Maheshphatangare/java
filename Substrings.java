public class Substrings {
    public static void main(String[] args) {
        String str = "Hello";

        // Generate all possible substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
