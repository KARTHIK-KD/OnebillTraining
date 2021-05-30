import java.util.LinkedList;

public class LinkedListString {
	public static void main(String[] args) {
		LinkedList<String> planguage=new LinkedList<String>();
		planguage.add("C");
		planguage.add("C++");
		planguage.add("Java");
		System.out.println(planguage);
		
		System.out.println(planguage.get(1));
		planguage.set(1,"SQL");
		System.out.println(planguage);
		
	}

}
