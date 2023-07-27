import java.util.Arrays;
class AnagramString {
    
    public static void main(String[] args) {
    
    String s1="Mahesh BOSS";
    String s2=" BOSSMahesh ";
    s1=s1.replace(" ","");
     s2=s2.replace(" ","");
    char a[]=s1.toCharArray();
     char b[]=s2.toCharArray();
     
     Arrays.sort(a);
      Arrays.sort(b);
      
      
      boolean b1=Arrays.equals(a,b);
        System.out.println("the string anagram is!"+b1);
    }
}
