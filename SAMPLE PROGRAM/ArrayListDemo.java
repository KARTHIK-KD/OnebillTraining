import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		System.out.println("---for loop----");
		
		System.out.println("----- For Each-----");
		for(Integer i:arrayList)
			System.out.println(i);
		
		System.out.println("----- Iterator------");
		Iterator<Integer> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
