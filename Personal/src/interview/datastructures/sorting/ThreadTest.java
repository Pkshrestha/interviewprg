package interview.datastructures.sorting;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPrint p=new MyPrint();
Thread t=new Thread(new Mythread(p));
Thread t1=new Thread(new Mythread(p));
t.start();
t1.start();
	}

}

class Mythread implements Runnable{
	Mythread(MyPrint print){
		i=print;
	}
MyPrint i;

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getName()+" : "+i++);
		i.print();
//		if(i==0){
//		day();}
//		else
//		night();
		
		
	}}
class MyPrint{
	int i=0;
	public void print(){System.out.println(Thread.currentThread().getName()+" : "+i++);}
}