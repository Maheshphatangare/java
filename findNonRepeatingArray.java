class findNonRepeatingArray {
//     public static int findNonRepeating(int[] arr) {
//     int result = 0;
//     for (int i = 0; i < arr.length; i++) {
//         result ^= arr[i];
//     }
//     return result;
// }
    public static void main(String[] args) {
        System.out.println("the element having no pair in Array is:");
        int Arr[]={5,4,1,4,3,5,1};
        int res=0;
        for(int i=0;i<Arr.length;i++)
        {   
            res=res^Arr[i];
        }
        System.out.println("the unpaire no is:"+res);
    }
}
