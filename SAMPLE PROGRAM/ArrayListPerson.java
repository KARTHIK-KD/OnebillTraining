import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPerson {
	public static void main(String[] args) {
		ArrayList<Person> person=new ArrayList<Person>();
		person.add(new Person(25,"karthik"));
		person.add(new Person(10,"saravanan"));
		person.add(new Person(20,"Ravi"));
		
		Collections.sort(person);
		for(Person x:person)
			System.out.println(x);
		
	}

}
