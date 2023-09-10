// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
public class TowerofHanoi {
    public static void toh(int n,char A,char B,char C){
    if(n==1)
    {
        System.out.println(A+"--->"+C);
        return;
    }
        toh(n-1,A,C,B);
         toh(1,A,B,C);
        toh(n-1,B,A,C);
    }
    public static void main(String[] args) {
        int n=3;
       
        System.out.println("Hello, World!");
        toh(n,'a','b','c');
    }
}



