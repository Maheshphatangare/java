class ispowoftwo {
   static boolean ispowoftwo(int n)
    {
        if(n==0)
        return false;
        return((n&(n-1))==0);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("the no is power of 2"+ispowoftwo(n));
    }
}
