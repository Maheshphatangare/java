class secondsmallArr {
    
    static int secondSmallest(int arr[], int n)
   {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int i=0; i < n; i++){
            if(arr[i] < first){ 
            second = first; 
            first = arr[i];
            } 
            else if(second>arr[i])
           second = arr[i];
        }
        return second;
   }
    public static void main(String[] args) {
     int arr[] = {12, 13, 1, 11, 34, 11};
      int n = arr.length;
      System.out.print("Second Smallest:" + secondSmallest(arr, n)); 

    }
}
