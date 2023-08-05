class ram{
     public  int revers(int n){
     
        int rev=0;
        while(n!=0)
        {
            int a=n%10;
            rev=rev*10+a;
           n= n/10;
            
        }
        return rev;
    }
}

class revno {
   
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       
        ram r=new ram();
       // int s=H.revers(13757);
        System.out.println("the reverno is"+ r.revers(13757) );
    }
}
