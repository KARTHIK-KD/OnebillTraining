
public class MainThread {
	public static void main(String[] args) {
		Thread1 one=new Thread1();
		Thread2 two=new Thread2();
		one.run();
		two.run();
		
	}

}
