import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		try {
			
			//create file  
			
			File f1=new File("D:\\FileHandling\\Batch1.txt");
			
			//createNewFile() -it will create new empty file
			//getName()-it read file name
			if(f1.createNewFile()) {
				System.out.println("File"+f1.getName()+"create successfully");
			}
			else
			{
				System.out.println("File is already exist");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
