import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		HashMap<Integer,String>h1=new HashMap<Integer,String>();
		
		h1.put(101,"jhon");
		h1.put(102,"sam");
		h1.put(103,"Raj");
		h1.put(104,"Ajay");
		h1.put(105,"shree");
		
		System.out.println(h1);
		
		System.out.println(h1.size());
		
		HashMap<Integer,String>h2=new HashMap<Integer,String>(h1);
		
		
		System.out.println(h2);
		
		h2.clear();
		if(h2.isEmpty()) {
			
			System.out.println("Map is empty");
		}
		else {
			System.out.println(h2);
		}
		

	}

}
