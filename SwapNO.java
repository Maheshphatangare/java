class SwapNO {
    public static void main(String[] args) {
     //swap
        int a=10;
        int b=13;
        int c;
        //1)creating temp then swap
        // c=a;
        //  a=b;
        // b=c;
       //2) using + - not temp var
        // a=a+b;
        //  b=a-b;
        // a=a-b;
        
         //3) using */ - not temp var
        // a=a*b;
        //  b=a/b;
        // a=a/b;
       //4) using bitwise operater 
    //   a=a^b;
    //   b=a^b;
    //   a=a^b;
    //5)using one statement
    b=a+b-(a=b);
       
       
         System.out.println("A="+a);
          System.out.println("B="+b);
    }
}
