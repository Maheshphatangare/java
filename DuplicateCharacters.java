import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to character array
        char[] characters = str.toCharArray();
        
        // Iterate over each character
        for (char c : characters) {
            // If the character is already present in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is encountered for the first time, add it to the map with count as 1
                charCountMap.put(c, 1);
            }
        }
        
        // Iterate over the map to find the duplicate characters
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate character: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}
