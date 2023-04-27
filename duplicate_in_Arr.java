import java.util.*;
import java.util.Scanner;
class duplicate_in_Arr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the Size of Array:");
        int size=sc.nextInt();
        String arr[]=new String[size];
        System.out.println("enter the element of Array:");
        for(int i=0; i<size; i++) {
            arr[i]=sc.nextLine();
        }
         
       HashSet <String> asg=new HashSet();
             for(String s:arr)
             {  
                 if(asg.add(s)==false){
                 System.out.println("duplicate is found::+s);
             }}
         
        
    }
}
