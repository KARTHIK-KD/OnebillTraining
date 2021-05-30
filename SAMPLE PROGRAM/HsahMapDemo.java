import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HsahMapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		h1.put("one", 1);
		h1.put("two", 2);
		h1.put("three", 3);
		
		Set<Map.Entry<String,Integer>> m1=h1.entrySet();
		for(Entry<String, Integer> entry:m1)
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
			
			
	}

}
