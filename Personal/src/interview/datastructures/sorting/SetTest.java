package interview.datastructures.sorting;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set=new TreeSet<String>();
set.add("prasanta");
set.add("kumar");
set.add("shrestha");
set.add("pramod");
set.add("kumar1");
set.add("prasanta1");
for (String string : set) {
System.out.println(string);	
}
System.out.println("/////////////////////");

Map <String,String> map=new TreeMap<String,String>();


map.put("prasanta","");
map.put("kumar","");
map.put("shrestha","");
map.put("pramod","");
map.put("kumar1","");
map.put("prasanta1","");
for (String string : map.keySet()) {
System.out.println(string);	



}

System.out.println("/////////////////////");	
Set<Employee> set1=new TreeSet<Employee>();
set1.add(new Employee("Roopa","100000"));
set1.add(new Employee("kumar","400000"));
set1.add(new Employee("shrestha","30000"));
set1.add(new Employee("pramod","5434543"));
set1.add(new Employee("kumar1","4543545"));
set1.add(new Employee("prasanta1","456543456"));
for (Employee emp : set1) {
System.out.println(emp.getEmp()+":"+emp.getSal());	
}
System.out.println("/////////////////////");
	
	}

}
