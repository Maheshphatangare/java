import java.util.*;
import java.util.Scanner;

public class revvstring {
  static void revstring(String str) {
     
      //String str = ss;
  
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
  
    
   }
  static void Revstring(String str) {
     
      //char[] CharArr= str.toCharArray();
      String rev="";
      	char ch;
    //   for(int i= str.length()-1;i<=0;i--)
    //   {
    //       rev=rev+CharArr[i];
    //   }
    // System.out.println("reverse Array is :"+rev);
    
    	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		rev= ch+rev; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ rev);
	}
  

  public static void main(String[] args) {
   Scanner sobj= new Scanner(System.in);
   System.out.println("enter the String");
   String ss = sobj.nextLine();
   revstring(ss);
   Revstring(ss);
   
   
  }
}
