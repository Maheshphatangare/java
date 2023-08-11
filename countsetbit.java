public class countsetbit {
	static int count1(int n)
    { 
		int count=0;
        while(n>0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int no=3;
        System.out.println("the 1 present in the no is::" + count1(no));
    }
}
