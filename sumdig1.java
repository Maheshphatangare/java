class sumdig1 {
    static int getsum(int n)
    {
    if(n==0)
    return 0;
    else
    return getsum(n/10)+n%10;
    }
    public static void main(String[] args) {
       
        System.out.println("Sum of Digit is!"+ getsum(873) );
    }
}
