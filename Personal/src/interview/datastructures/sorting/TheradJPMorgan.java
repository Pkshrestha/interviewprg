package interview.datastructures.sorting;

public class TheradJPMorgan implements Runnable{
static int i=0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TheradJPMorgan m1=new TheradJPMorgan();
		Thread.currentThread().setName("MainThread");
		Thread t1=new Thread(new TheradJPMorgan());
		Thread t2=new Thread(new TheradJPMorgan());
		Thread t3=new Thread(new TheradJPMorgan());
		Thread t4=new Thread(new TheradJPMorgan());
		Thread t5=new Thread(new TheradJPMorgan());
		Thread t6=new Thread(new TheradJPMorgan());
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		t5.setName("t5");
		t6.setName("t6");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		//m1.myMethod();
		Thread.currentThread().join();
		System.out.println("Hi i m ready again");}
		public void myMethod(){
			//System.out.println(Thread.currentThread().getName());
		synchronized(this){
		
try {
	this.wait();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}

	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this){
			
			System.out.println(Thread.currentThread().getName());
			i=i+20;
			if(i==60){notifyAll();
				System.out.println("Main thread starts");};	
			}
		
	}

}
