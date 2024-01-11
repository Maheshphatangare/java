import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        
        String str = "Ragu Pati Raghava Raja Ram Patit A pavan Sita Ram";
         
        String convertedString = convertCase(str);
        System.out.println("Converted string: " + convertedString);
    }
    
    public static String convertCase(String str) {
        StringBuilder converted = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isUpperCase(c)) {
                converted.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                converted.append(Character.toUpperCase(c));
            } else {
                converted.append(c);
            }
        }
        
        return converted.toString();
    }
}
