

class Printer{
	void printDoc(int numberOfCopies,String docName) {
		for(int i=1;i<=numberOfCopies;i++)
			System.out.println(">>printing Doc "+docName+" pages "+i);
	}
}

class Karthik extends Thread{
	Printer printerref;
	public Karthik(Printer p) {
		printerref=p;
	}
	public void run() {
		printerref.printDoc(10,"karthik.pdf");
	}
}

class Mohan extends Thread{
	Printer printerref;
	public Mohan(Printer p) {
		printerref=p;
	}
	public void run() {
		printerref.printDoc(10,"Mohan.pdf");
	}
}


public class PrinterApp {
	public static void main(String[] args) {
		System.out.println("Printer Application...");
		Printer p=new Printer();
		
		Karthik one=new Karthik(p);
		Mohan two=new Mohan(p);
		
		one.start();
		two.start();
	}
}
