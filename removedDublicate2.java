// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class HelloWorld {
    static int removedubli(int a[])
    {
        Arrays.sort(a);
        int rd=0;
        for(int i=1;i<a.length;i++){
    if(a[rd]!=a[i]){
        rd++;
        a[rd]=a[i];
    }
        }return rd+1;
        
    }
    public static void main(String[] args) {
        int[] a={1,2,3,1,3,2,4};
        System.out.println("given Array is"+Arrays.toString(a));
         System.out.println("removing dublicate array:");
       int rd = removedubli(a);
       for(int i=0;i<rd;i++){
           System.out.print(a[i]);
       }

        
    }
}
