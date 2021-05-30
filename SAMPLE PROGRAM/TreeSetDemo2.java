import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Person> ts=new TreeSet<Person>(new SortTreeSet());
		ts.add(new Person(21,"karthik"));
		ts.add(new Person(22,"ravi"));
		ts.add(new Person(19,"priya"));
		
		for(Person p:ts)
			System.out.println(p.getName());
	}

}
