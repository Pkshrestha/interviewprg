package interview.datastructures.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DigiQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cu1=new Customer(1,"prasanta",new Address("Bengaluru",560037));
		Customer cu2=new Customer(2,"Kiran",new Address("Bengaluru",560037));
		Customer cu3=new Customer(3,"Roopa",new Address("Tumkur",560005));
		Customer cu4=new Customer(4,"Charu",new Address("UP",56034));
		Map <Address,Customer> mymap=new HashMap();
		mymap.put(cu1.address, cu1);
		mymap.put(cu2.address, cu2);
		mymap.put(cu3.address, cu3);
		mymap.put(cu4.address, cu4);
		for (Entry<Address, Customer> entry : mymap.entrySet()) {
			System.out.println(entry.getValue().id+":"+entry.getValue().name+":"+entry.getValue().address.city+""+entry.getValue().address.pin);
			
		}
		
	}

}
class Customer{
	int id;
	String name;
	Address address;
	public Customer(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
class Address{
	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + pin;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (pin != other.pin)
			return false;
		return true;
	}

	String city;
	int pin;
}