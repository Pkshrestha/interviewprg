package interview.datastructures.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ListTest {

	public static void main(String[] args) {
		//removeElements();
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList();
		list.add("prasanta");
String s;
		list.add("prasanta2");

		list.add("prasanta3");
	//list.add("prasanta4");
	ListIterator it= list.listIterator();
	
	try{
while(it.hasNext()){

if(it.next().equals("prasanta3")){
	boolean b=list.remove("prasanta");}
	
	//System.out.println(it.next());
	//System.out.println(it.next().toString());
}
}catch(Exception e){
}
	System.out.println(list);}
		
	
	private static void removeElements()
	{
		List<String> names =new ArrayList<String>();
		names.add("ab");
		names.add("aab");
		names.add("ab");
		//names.remove("ab");
		System.out.println(names);
		Iterator it=names.iterator();
		List newlist=new ArrayList();
		newlist.add("ab");
		newlist.add("abc");
		names.removeAll(newlist);
		System.out.println(names);
	}
	
}
