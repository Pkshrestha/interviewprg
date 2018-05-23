package interview.datastructures.sorting;

import java.util.ArrayList;
import java.util.List;

public class Stringcobinationofname {
	static String string="";
	static int data=-1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="abc";
getallcombination(name,name.length(),name.length(),-1);
for(String string:list){
	System.out.println("//"+string);
}
	}
static List<String> list=new ArrayList<String>();
	private static List<String> getallcombination(String name, int length, int length2,
			int index) {
		int j=0;
		if(length2==0){
			list.add(string);
			System.out.println(string);
			string="";
			data=j++;
			return list;
			
		}
		
		for(int i=++data;i<name.length();i++){
			//if(!(ik==i)){
			string=string+name.charAt(i);
			//index=i;
			getallcombination(name,length,length2-1,i);
			string="";
		}//}
		// TODO Auto-generated method stub
		return list;
	}

}
