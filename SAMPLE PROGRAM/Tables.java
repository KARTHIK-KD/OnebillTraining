
public class Tables {
	public void printTable(int number) {
		for(int i=1;i<10;i++)
			System.out.println(i*number);
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
