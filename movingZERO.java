import java.util.Arrays;
import java.io.*; 
class movingZERO {
    public static void main(String[] args) {
        System.out.println("moving zero!");
        int arr[]={10,0,20,0,40,0,40,50};
        System.out.println(Arrays.toString(arr));
         
         for(int i=0;i<arr.length;i++)
         if(arr[i]==0)
         { 
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]!=0)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
         }
         System.out.println(Arrays.toString(arr));
    }
}
