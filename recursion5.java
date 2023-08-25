class recursion5 {
    static void fun(int n)
    { if(n==0)
    return;
    fun(n-1);
    System.out.println(n);
    fun(n-1);
        
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        fun(3);
    }
}
