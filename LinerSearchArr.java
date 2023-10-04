import java.util.*;

import java.util.Scanner;
class LinerSearchArr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

     System.out.println("enter the size of Array");
     int size= sc.nextInt();
     int arr[]=new int[size];
     System.out.println("enter the element in Array");
     for(int i=0;i<arr.length;i++)
     {
         arr[i]=sc.nextInt();
     }
        System.out.println("enter the no for Search:");
        int ss=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(ss==arr[i])
            {
                System.out.println("no is found at position "+ (i+1));
            }else
            {
                   System.out.println("the no is not found in Array");
                   break;
            }
        }
    }
}
