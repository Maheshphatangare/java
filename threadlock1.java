class LockDemo {
	
	synchronized void show(String msg) {
		System.out.print("["+msg+"]");
//		
	}
}

class Demo3 extends Thread{
	
	String msg;
	LockDemo l1;
	Demo3(String a,LockDemo l2){
		msg=a;
		l1=l2;
	}
	public void run() {
		l1.show(msg);
	}
	
}
public class test1 {

	public static void main(String[] args) {
	
		LockDemo lock=new LockDemo();
		Demo3 d1=new Demo3("HI",lock);
		Demo3 d2=new Demo3("Hello",lock);
		Demo3 d3=new Demo3("H r u??",lock);
		
		d1.start();
		try {
			d1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d2.start();
		try {
			d2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d3.start();

	}

}
