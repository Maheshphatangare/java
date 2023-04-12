import java.util.Scanner;

   import java.io.*;
class countEven {
   static int counteven(int no)
    {
      int  idig=0;
     int   count=0;
        if(no==0)
        {
            return 1;
        }
        while(no!=0)
        {
            idig=no%10;
            if(idig%2==0)
            {
                count++;
            }
            no=no/10;
        }
        return count;
    }
   
public static void main(String args[]){       
  Scanner sc=new Scanner(System.in);    
    
        System.out.println("enter the no");
        int iNo= sc.nextInt();
        //countEven st =new countEven(iNo);
        System.out.println("counteven are:"+ counteven(iNo));
        
    }
    
}     
      
