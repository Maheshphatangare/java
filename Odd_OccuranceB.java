public class Odd_OccuranceB {
  
       
    public static void main(String[] args) {
        int arr[]={4,3,4,4,4,5,5,3};
       // System.out.println("Hello, World!"+ occure(arr));
         int ret=0;
        for(int i=0;i<arr.length;i++)
        {
          
            ret=ret^arr[i];
            
        }
        System.out.println(ret);
    }
    
}
