
public class SyncTables {
	public static void main(String[] args) {
		Tables table=new Tables();
		
		Runnable ref1 = () -> {
			synchronized (table) {
				table.printTable(2);
			}
		};
		
		Runnable ref2 = () -> {
			synchronized ( table) {
				table.printTable(5);
			}
		};
		
		Thread one=new Thread(ref1);
		Thread two=new Thread(ref2);
		one.start();
		two.start();
		
	}

}
