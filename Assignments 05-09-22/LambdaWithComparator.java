package java8features;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


class person
{
	int id;
	String name;
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class LambdaWithComparator {

	public static void main(String[] args) {
		List<person> persons = new ArrayList<person>();
		persons.add(new person(101,"Shawin"));
		persons.add(new person(102,"Nilanjan"));
		persons.add(new person(103, "Pallab"));
		
		System.out.println("Sorting using names");
		Collections.sort(persons, (p1,p2)->
		{
			return p1.name.compareTo(p2.name);
		});
		
		//print
		persons.forEach(
				(p)-> {System.out.println(p);}
				);

	}

}
