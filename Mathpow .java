//power
class Mathpow {
   public static int pow(int base,int rise){
       int b=base;
       int r=rise;
       int result=1;
       for(int i=1;i<=rise;i++){
          result=result*base;
       }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a=3;
        int b=2;
        pow(a,b);
        System.out.println("power is:"+ pow(a,b));
    }
}
