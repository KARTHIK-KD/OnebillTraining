
class MultiThread1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
}

public class MultiThreadExtends {
	public static void main(String[] args) {
		MultiThread1 obj=new MultiThread1();
		obj.start();
	}

}
