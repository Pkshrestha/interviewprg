package interview.datastructures.sorting;

public class StringCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abc";
getCombination(s);
	}

	private static void getCombination(String s) {
		// TODO Auto-generated method stub
		for(int i=1;i<=s.length();i++){
			//we are passing -1 in argument for gettiing non repeat character like ab,ba,aa,bb,cc
			//if you want all combination then getallcombination(s,s.length(),i,"",-1);
		
			getallcombination(s,s.length(),i,"",-1);
		}
	}

	private static int getallcombination(String s, int length, int i,
			String string,int index) {
		// TODO Auto-generated method stub
		if(i==0){
			System.out.println(string);
		return 0;
		}
		for(int j=0;j<s.length();j++){
			String sd=string+s.charAt(j);
			getallcombination(s,length,i-1,sd,j);
		}
		return 0;
	}

}
