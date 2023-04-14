import java.util.Scanner;
class Revno {
    public void reverse(int x) {
      int rev=0;
      int i;
        if(x<0)
        {
            x=-x;
             while(x>0){
            i=x%10;
            rev=rev*10+i;
            x=x/10;
        }
        System.out.println("-"+rev);
    }
     if(x>0){   
        while(x>0){
            i=x%10;
            rev=rev*10+i;
            x=x/10;
        }
        System.out.println(rev);
    }}

public static void main(String Arr[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no for reverse");
    int no=sc.nextInt();
  Revno s=new Revno();
    
    s.reverse(no);

}
}
