package interview.datastructures.sorting;

public class ThreadHiBye implements Runnable {
int k;
	public ThreadHiBye(int k) {
	super();
	this.k = k;
}

	public static void main(String[] args) {
		int i=1;int j=2;
		// TODO Auto-generated method stub
Thread t=new Thread(new ThreadHiBye(i));
Thread t1=new Thread(new ThreadHiBye(j));
t.start();
t1.start();



	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		if(k%2!=0){for(;k<20;){printhi();k=k+2;}}
		else {for(;k<20;){printbye();k=k+2;}};
		
	}
	
	public synchronized void printhi() {
		System.out.println(Thread.currentThread().getName()+" : HI");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void printbye(){
		System.out.println(Thread.currentThread().getName()+" : Bye");
		System.out.println(Thread.currentThread().getName()+" : HI");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
