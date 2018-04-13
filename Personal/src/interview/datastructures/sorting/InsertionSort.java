package interview.datastructures.sorting;

import java.util.TreeSet;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myarray [] ={9,2,7,12,6,23,16,1};
		int sortedarray[]=sort(myarray);
		for (int i : sortedarray) {
			System.out.println(i);
		}
		
	}

	private static int[] sort(int[] myarray) {
		// TODO Auto-generated method stub
		for(int i=1;i<myarray.length;i++){
			int key=myarray[i];
			int j=0;
			boolean b=false;
			for(int k=i-1;k>=0;k--){
				if(myarray[k]>key){
					myarray[i]=myarray[k];
					j=i;
					b=true;
				}//key=myarray[i];
			}if(b)myarray[j]=key;
		}
		return myarray;
	}

}
