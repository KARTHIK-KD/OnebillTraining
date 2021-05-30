import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Employee,Integer> tm=new TreeMap<Employee,Integer>(new SortByTreeMap());
		tm.put(new Employee(1,"karthik"),300);
		tm.put(new Employee(2,"saravanan"), 200);
		
		Set<Map.Entry<Employee,Integer>> m1=tm.entrySet();
		for(Map.Entry<Employee,Integer> itm:m1) {
			System.out.println(itm.getKey());
		}
	}

}
