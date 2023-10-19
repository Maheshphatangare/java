import java.sql.*;
import java.io.*;
class jdbc3{
    public static void main(String []args)
    {
        try{
        //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
           //create a connection
          
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
           
           Statement stmt=con.createStatement();
           stmt.executeUpdate("insert into person values(107,\"mesh\",52);");
            
            ResultSet set=stmt.executeQuery("select * from person");
          
       
            while(set.next())
            {
            	System.out.print(set.getInt("pid"));
            	System.out.print(set.getString("pname"));
            	System.out.print(set.getInt("age"));
            	System.out.println();
            }
           
            
            con.close();


        
        
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
