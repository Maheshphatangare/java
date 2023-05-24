import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
    
    public static int countVowels(String str) {
        int count = 0;
        
        str = str.toLowerCase(); // Convert the string to lowercase for easier comparison
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
