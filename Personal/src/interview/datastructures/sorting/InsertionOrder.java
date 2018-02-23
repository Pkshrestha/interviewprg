package interview.datastructures.sorting;

public class InsertionOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array={3,6,2,9,5,0,1};
int temp;
for(int i=1;i<array.length;i++){
	temp=array[i];int j=i;
	while(j>0 && array[j-1]>temp  ){
	
		array[j]=array[j-1];
		array[j-1]=temp;
		j--;
	
	}
	
}
for(int i=0;i<array.length;i++)
System.out.println(array[i]);
	}

}
