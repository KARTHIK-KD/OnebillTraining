
public class Thread2 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=5;i<10;i++)
			System.out.println(i);
	}

}
