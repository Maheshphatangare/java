class recurtion3{
    public static void printrev(String s,int idx)
    {
        if(idx==0)
        {
            System.out.println(s.charAt(idx));
          return;
        }
        System.out.println(s.charAt(idx));
          printrev(s,idx-1);
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello!");
        String str="abcd";
        printrev(str,str.length()-1);
        
    }
}
