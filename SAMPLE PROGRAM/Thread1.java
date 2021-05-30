
public class Thread1 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
			System.out.println(i);
	}

}
