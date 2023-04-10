import java.io.*;
class countEven {
    int counteven(int no)
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
   
public static void main(String args[])throws Exception{       
  InputStreamReader r=new InputStreamReader(System.in);    
     BufferedReader b=new BufferedReader(r);  
        System.out.println("enter the no");
        int iNo= Integer.parseInt(b.readLine());
        countEven st =new countEven(iNo);
        System.out.println("counteven are:"+ st );
        
    }
    
}
