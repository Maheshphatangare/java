import java.util.Scanner;
class binerySearch{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to Search");
        int key= sc.nextInt();
        int h=arr.length-1;
        int l=0;
        Boolean f=false;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]==key)
            {
                System.out.println("the no is found:");
                f=true;
                break;
            }
            if(arr[m]<key)
            {
                l=m+1;
            }
            if(arr[m]>key)
            {
                h=m-1;
            }
            if(f==false)
            {
                System.out.println("Hello, World!"); 
            }
        }
        
        
    
    }
}
