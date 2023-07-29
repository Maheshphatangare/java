// permutation of String 
public class perStr {
	static void perstr(String s,String permi) {
		if(s.length()==0)
		{
			System.out.println(permi);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char curr= s.charAt(i);
			
			String newS = s.substring(0, i)+ s.substring(i+1);
			
			perstr(newS,permi+curr);
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		String permi="";
		perstr(str,permi);

	}

}
