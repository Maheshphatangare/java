import java.util.Arrays; 
public class frequencyofArray2 {

	
	public static void countfrq(int[] arr, int size) {
		
		Arrays.sort(arr);
		for(int i=0;i<size;i++) {
			int count=1;
			System.out.println("for:"+i);
			while(i<=size-1&&arr[i]==arr[i+1]) {
				i++;
				count++;
				System.out.println("while:"+i);
			}
			System.out.println("Array:: "+arr[i]+"   freq::  "+ count);
			//count++;
		}
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] Arr= {1,5,2,4,2,1,2,1,5,7,5,7,6,8,9,0,2,3,1};
        int size=Arr.length;
        countfrq(Arr,size);
         
	}
