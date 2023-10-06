import java.io.FileOutputStream;

public class Fileout {

	public static void main(String[] args) {
		
//passing or writing data in the form array
		try {
			//FileOutputStream write the data suppose if file is not 
			//their it will create
			FileOutputStream  fo=new FileOutputStream("D:\\FileHandling\\Batch1.txt");
			String s="Java is Platform independenent";
			//converting string into Array byte
			byte b[]=s.getBytes();
			
			fo.write(b);
			fo.close();
			System.out.println("Data inserted successfully");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
