import java.util.Scanner;
public class selctionSort {

	public static void main(String[] args) {
		//int Arr[]= {2,56,78,9,34,67};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array for Sorting:");
		int size=sc.nextInt();
		int Arr[]=new int[size];
		System.out.println("enter the element for sorting::");
		for(int i=0;i<size;i++) {
			Arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++)
			{
				if(Arr[j]<Arr[i]) { 
					int temp=Arr[j];
					Arr[j]=Arr[i];
					Arr[i]=temp;
				}
			}
		}
		for(int e:Arr)
		{
			System.out.println("the SelectionSort:"+ e);
		}
		// TODO Auto-generated method stub

	}

}
