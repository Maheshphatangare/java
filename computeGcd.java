 public class gcdoftwo{
       static int computeGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return computeGcd(num2, num1 % num2);
    }
       public static void main(String arg[])
       {
           int n1=0,n2=12;
           System.out.println("gcd of n1 and n2 is::"+computeGcd(n1, n2));
       }
   } 
