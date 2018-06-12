package interview.datastructures.sorting;

public class StringReverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Prasanta";
String reverseName=getReverseName(name);
System.out.println(reverseName);
	}
static	String namereverese="";
	private static String getReverseName(String name) {
		// TODO Auto-generated method stub
		
		if((name==null) || (name.length()<=1)){
						return name;}
		else{
			System.out.println(namereverese);
		return namereverese+=name.charAt(name.length()-1)+getReverseName(name.substring(0,name.length()-1));
	}}

}
