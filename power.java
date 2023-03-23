import java.util.*;
import java.util.Scanner;
class power
{
  static  int power(int n, int k)
    {  int res=1;
        for(int i=1;i<=k;i++)
        
              
            
                 res = res*n;
                 return res ;
        
       

    }
    public static void main(String Arg[])
    {
        Scanner sc =new Scanner(System.in);
        int n ,k,res=0;
        System.out.println("enter the no ::");
        n=sc.nextInt();
        System.out.println("enter the powerno ::");
        k=sc.nextInt();
        //System.out.println(myMethod(5, 3));
        
        System.out.println("Result ::"+power(n, k));



    }
}