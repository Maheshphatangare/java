import java.util.LinkedList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;


	public class test1 {

		public static void main(String[] args) {
			Set<String>s1=new HashSet<String>();
			//no dublicate
			s1.add("Apple");
			s1.add("Banana");
			s1.add("Avacado");
			s1.add("pear");
			s1.add("pear");
			s1.add("pomogranet");
			System.out.println(s1);
			Set<String>s2=new LinkedHashSet<String>();
			//secquance
			s2.add("Apple");
			s2.add("Banana");
			s2.add("Avacado");
			s2.add("pear");
			s2.add("Beat");
			
			s2.add("pomogranet");
			System.out.println(s2);
			
			Set<String>s3=new TreeSet<String>();
			//arrange in acending order
			s3.add("Apple");
			s3.add("Banana");
			s3.add("Avacado");
			s3.add("pear");
			s3.add("Beat");
			
			s3.add("pomogranet");
			System.out.println(s3);
			
		}

	}
