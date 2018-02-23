package interview.datastructures.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int array []={15,7,2,6,5,3,19};
			int iteration=0;
			boolean flag=true;
			for(int i=0;i<array.length && flag;i++)
			{
				//Here we are using flag to decrease the iteration
					flag=false;
					for(int j=i+1;j<array.length-i;j++)
					{
							iteration++;
							if(array[j-1]<array[j])
							{
								flag=true;
								int temp=array[j-1];
								array[j-1]=array[j];
								array[j]=temp;
							}
					}
			}
			System.out.println("NO of iteration : "+iteration);
			for(int i=0;i<array.length;i++){
					System.out.println(array[i]);
			}
		}

}
