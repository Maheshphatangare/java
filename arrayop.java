import java.util.Scanner;

 class arrayop{
     int max(int []arr)
     { int max=0;
         for(int i=0;i<arr.length;i++)
         if(max<arr[i])
         {
             max=arr[i];
         }
         return max;
     }

    public static void main(String[] args) {
            
     
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the size of Array");
        int t=sc.nextInt();
        int arr[]=new int[t];
        System.out.println("enter the element in Array:");
       
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
    //   for(int num:arr){
    // System.out.println(""+num);
    arrayop m=new  arrayop(); //obj of own class
    System.out.println(" "+m.max(arr));
        //moral of the story is that to send the array in the method we //need  to creat the class object first then use it for calll
       }                

}
