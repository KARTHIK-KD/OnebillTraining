import java.awt.List;
import java.util.ArrayList;

public class ArrayListWorking {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println("Array List");
		System.out.println(arrayList);
		
		arrayList.set(2, 90);
		System.out.println("Set with index");
		System.out.println(arrayList);
		
		//List list=arrayList.subList(1,3);
		//System.out.println(list);
		
		

	}

}
