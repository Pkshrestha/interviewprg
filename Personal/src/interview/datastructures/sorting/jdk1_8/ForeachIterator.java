package interview.datastructures.sorting.jdk1_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForeachIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
for(int i=0;i<10;i++){
	list.add(i);
}
list.forEach(new Consumer<Integer>(){public void accept(Integer t) {
	System.out.println("forEach anonymous class Value::"+t);
	};

});
MyConsumer my=new MyConsumer();
list.forEach(my);
}}
	class MyConsumer<Integer, T> implements Consumer<T>{

	@Override
	public void accept(T t) {
		// TODO Auto-generated method stub
		System.out.println("Consumer impl Value::"+t);
		
	}
	
}