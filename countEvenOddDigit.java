// Online Java Compiler
// Use this editor to write, compile and run your Java code online


 import java.util.Scanner;

 
class countEvenOddDigit {
   static void countevenoddDigit(int no)
    {
      int  idig=0;
     int   ecount=0, ocount=0;
        if(no==0)
        {
           System.out.println("no even not Odd");
        }
        while(no!=0)
        {
            idig=no%10;
            if(idig%2==0)
            {
                ecount++;
            }else{
                ocount++;
            }
            no=no/10;
        }
       System.out.println("the even digit in the no is"+ecount);
       System.out.println("the odd counter is::"+ ocount);
    }
   
public static void main(String args[]){       
  Scanner sc=new Scanner(System.in);    
    
        System.out.println("enter the no");
        int iNo= sc.nextInt();
        //countEven st =new countEven(iNo);
       countevenoddDigit(iNo);
        
    }
    
}     
      
