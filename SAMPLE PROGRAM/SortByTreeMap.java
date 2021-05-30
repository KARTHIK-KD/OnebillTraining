import java.util.Comparator;

public class SortByTreeMap implements Comparator<Employee> {
	public int compare(Employee o1,Employee o2) {
		return o1.getId() - o2.getId();
	}
	
}
