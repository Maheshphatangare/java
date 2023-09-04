import java.util.Scanner;
public class alldiviser {
   
//alldivition
   
        public static void main(String[] args) {
            System.out.println("Hello, World!");
         Scanner sobj=new Scanner(System.in);
         
            int a;
            System.out.println("enter the no:");
            a=sobj.nextInt();
            for(int i=1;i<(a/2);i++)
            {
                if(a%i==0){
                System.out.println("the diviser of number is:"+i);
                
            }
        }
          
        
        }
    }
