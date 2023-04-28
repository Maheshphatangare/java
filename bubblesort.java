import java.util.*;
class bubblesort{
    public static void main(String[] args) {
        int arr[]={19,12,83,14,5,46,47,68,89,10};
       // Scanner sc=new Scanner(System.in);
       
       System.out.println("array before short:"+ Arrays.toString(arr));
       
      //  int key= sc.nextInt();
        int h=arr.length-1;
        int temp;
        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++)
            {
                if(arr[j]>arr[j+1])
                {
                   temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        System.out.println("after shorting arr"+Arrays.toString(arr));
        
    }
}
