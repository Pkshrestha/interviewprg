package interview.datastructures.sorting;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="";
s=s.concat("25");
StringBuffer sb=new StringBuffer(s);
StringBuffer s1=sb.append("25");
System.out.println(s1);
	int a=24;
	int b=23;int c=22;
	System.out.println(23+34+"raja");
	System.out.println("Surya Reddy"+25+26+27);
	System.out.println("Surya Reddy"+25+26+27);
	String ab="brendon";String bc="victor";
	
	System.out.println((ab=="brendon"));
	System.out.println(ab==new String("brendon"));
	System.out.println(ab+bc==new String("brendonvictor"));
	System.out.println(ab+bc);
	System.out.println((ab+bc).intern()=="brendonvictor");
	System.out.println((ab+bc)=="brendonvictor");
}}
