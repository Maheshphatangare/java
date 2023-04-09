// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class SumDigits  {
   static int SumDigits(int iNo)
{
    int iSum = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iSum = iSum + (iNo % 10);
        iNo /= 10;
    }
    return iSum;
}

    public static void main(String[] args) {
   
       Scanner sc=new Scanner(System.in);
System.out.println("Please enter number : \n");
 int iValue=sc.nextInt();
    
 
 System.out.println("Summation of digits : \n"+ SumDigits(iValue));
      
    }
}
