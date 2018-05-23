package interview.datastructures.sorting;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prasanta");
		Employee e=new Employee();
		e.setEmp("vivek");
		e.setSal("150000");
Map<Employee,String> map=new HashMap<Employee,String>();
String s=new String("Vivek");
System.out.println(e.hashCode());
map.put(e, "kiran");




ConcurrentHashMap hs=new ConcurrentHashMap();
hs.put("hi", "bye");
e.setEmp("Brendon");
e.setSal("1500000");

System.out.println(e.hashCode());
/*System.out.println(map.get(e));
e.setEmp("vivek");
e.setSal("150000");*/
System.out.println(map.get(e));
Employee e1=new Employee();
e1.setEmp("vivek");
e1.setSal("150000");
/*System.out.println(map.put(e1, "charu"));*/
System.out.println(e1.hashCode());
System.out.println(map.get(e1));

	}

}class Employee{
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String emp, String sal) {
		super();
		this.emp = emp;
		this.sal = sal;
	}
	String emp;
	String sal;
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	@Override
	public int hashCode() {
		String hash=this.emp+this.sal;
		return hash.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String hash=this.emp+this.sal;
		return hash.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		System.out.println(this.getSal()+";"+e.getSal()+":"+this.getEmp()+":"+e.getEmp());
		return this.getSal().equals(e.getSal())&& (this.getEmp().equals(e.getEmp()));
	}
}
