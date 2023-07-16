class  throw1 {
    public static void main(String[] args) {
        int bal=5000;
        int withdraw =6000;
       // try{
        if(bal<withdraw)
        throw new ArithmeticException("insufficient balance ");
        bal=bal-withdraw;
        System.out.println("transition Succes");
  //  }
 //   catch(ArithmeticException e)
    {
     //   System.out.println("Exception!"+ e.getMessage());
    }
}
}
