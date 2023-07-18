public class freq1 {

	public static void main(String[] args) {
		int Arr[]= {12,84,12,68,78,98,12,35,12,36,12};
		int counter=1;
		// TODO Auto-generated method stub
               for(int i=1;i<Arr.length;i++) {
            	  if( Arr[0]==Arr[i]) {
            		  counter++;
            	  }
               }
               System.out.println("the frequency of Arr 12 is ::"+ counter);
	}

}
