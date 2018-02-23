package interview.datastructures.sorting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringIntern {

	public static void main(String[] args) throws IOException {
		/*Runtime r=Runtime.getRuntime();
		System.out.println(r.freeMemory());
  String s1="Rajesh1";

  String s2="Rajesh2zdfxg";
 	for(int i=0;i<10;i++){
 		s2+=s2;
 		 System.out.println(r.freeMemory());
 		s1=new String("demo");
 		 System.out.println(r.freeMemory());
 		s1="demo"+i;
 		 System.out.println(r.freeMemory());
 	}
 System.out.println(r.freeMemory());
 String s3=s2+s1;
  String s4="Rajesh2Rajesh1";
  System.out.println(r.freeMemory());

System.out.println(s3==s4);
System.out.println(s3.equals(s4));
System.out.println(r.freeMemory());

*//*FileReader fl=new FileReader("abc.txt");
BufferedReader bf=new BufferedReader(fl);
String result="";
while((result=bf.readLine())!=null){
	System.out.println(result);
}
result.replaceAll("Abhilash", "Prasanta");*/
StringBuilder st1= new StringBuilder("prasanta");
StringBuilder st2= new StringBuilder("rajesh");
StringBuilder st3=new StringBuilder("gyan");
List list=new ArrayList();
list.add(st1);
list.add(st2);
list.add(st3);
Collections.sort(list,new MyComaprator());
		
System.out.println(list);
/*String s="Kiran";
String s1=s;

System.out.println(s+":"+s1);
s+=s;
System.out.println(s+":"+s1);*/
/*System.out.println(bf.readLine());
		String s3=new String("vivek");
		String s1=s3.intern();
		String s2="vivek";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
*/}
}
class MyComaprator implements Comparator<StringBuilder>{


	@Override
	public int compare(StringBuilder o1, StringBuilder o2) {
		// TODO Auto-generated method stub
		
		return o1.toString().compareTo(o2.toString());
	}
	
}
