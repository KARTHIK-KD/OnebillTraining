import java.util.Iterator;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(500);
		hs.add(200);
		hs.add(400);
		System.out.println(hs);
		System.out.println("size :"+hs.size());
		
		Iterator<Integer> iterator=hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
