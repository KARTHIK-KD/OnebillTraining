
class Multithread implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
}

public class MultiThreadImplements {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			Thread obj=new Thread(new Multithread());
			obj.start();
		}
	}

}
