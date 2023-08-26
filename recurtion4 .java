

class recurtion4 {
    static int fibonachi(int n)
    {
        if(n==0)
        {
            return 0;
        }if(n==1)
        {return 1;}
        return fibonachi(n-1)+fibonachi(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!" + fibonachi(3));
    }
}
