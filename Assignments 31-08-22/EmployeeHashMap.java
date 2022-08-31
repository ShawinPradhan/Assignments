package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeHashMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		
		//creating employee objects
		Employee emp1 = new Employee(101,"Shawin");
		Employee emp2 = new Employee(102,"Nilanjan");
		Employee emp3 = new Employee(103,"Pallab");
		Employee emp4 = new Employee(104,"Randhir");
		
		//storing information in hash map
		empMap.put(emp1.getEmpID(), emp1);
		empMap.put(emp2.getEmpID(), emp2);
		empMap.put(emp3.getEmpID(), emp3);
		empMap.put(emp4.getEmpID(), emp4);
		
		//way 2 reduce boiler plate code by declaring anonymously
//		empMap.put(1,  new Employee(101,"Shawin"));
//		empMap.put(2,  new Employee(102,"Nilanjan"));
//		empMap.put(3,  new Employee(103,"Pallab"));
//		empMap.put(4,  new Employee(104,"Randhir"));
		
		//display
//		Set<Map.Entry<Integer, Employee>> employees = empMap.entrySet();
//		
//		for(Map.Entry em:employees)
//		{
//			//System.out.println("Key: "+em.getKey());
//			Employee employ = (Employee) em.getValue();
//			employ.display();
//			System.out.println();
//			
//		}
		
		//Iterator
		Iterator itr = empMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			Employee emp = empMap.get(itr.next());
			emp.display();
		}
		
	}

}
