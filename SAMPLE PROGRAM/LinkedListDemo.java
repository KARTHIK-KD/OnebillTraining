import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Adding");
		System.out.println(list);
		
		list.add(0, 100);
		list.add(1, 200);
		System.out.println("Adding with Index");
		System.out.println(list);
		
		System.out.println("Remove");
		list.remove();
		System.out.println(list);
		System.out.println("remove Index position");
		list.remove(0);
		System.out.println(list);
		System.out.println("remove elements");
		list.remove(new Integer(40));
		System.out.println(list);
		
		list.set(2, 600);
		System.out.println("Set Elements or replace");
		System.out.println(list);
		
		list.addFirst(100);
		System.out.println("Add first");
		System.out.println(list);
		
		list.addLast(200);
		System.out.println("Add Last");
		System.out.println(list);
		
	}

}
