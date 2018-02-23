package interview.datastructures.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array []={15,7,2,6,5,3};


for(int i=array.length-1;i>0;i--){
	int max=0;
	for(int j=1;j<i;j++){
		if(array[max]<array[j]){
			max=j;
		}
	}
	int temp=array[max];
	array[max]=array[i];
	array[i]=temp;
	
}

for(int i=0;i<array.length;i++)
System.out.println(array[i]);
	}

}
