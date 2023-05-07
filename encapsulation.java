import java.io.*;
class bell{
   private int stid=101;
   private String name;
    //String stname="mahesh";
    //this getter is used to access the pri
     bell(){
         stid=0012021;
        name="Rutik";
        
     }
    bell(String name1,int id)
    { stid=id;
      name=name1;
     // System.out.println("hii i am bell by default \t");  
      
    }
    
    int getstid()
    {
        return stid;
    }
     String getname()
    {
        return name;
    }
    void setid(int ino)
    {
        stid=ino;
    }
    void setName(String name)
    {
      this.name=name;
    }
   
}
class Hell {
    public static void main(String[] args) {
        System.out.println("Hello, World!\t");
        //creating the object of bell class
        bell b=new bell("roman",56478);
        //calling the getstid method
           bell b1=new bell();
        //calling the string from bell
      //  String s=b.stname;
       
      // String st=b.setname("rom");
       //  String ss=b.getname();
        b1.setid(420);
        b1.setName("mahesh");
        System.out.println("detail \n"+ b.getstid() );
        System.out.println("name \n"+ b.getname() );
        
         System.out.println("setter \t"+ b1.getstid() );
        System.out.println("setter cha \t"+ b1.getname() );
    }
}

