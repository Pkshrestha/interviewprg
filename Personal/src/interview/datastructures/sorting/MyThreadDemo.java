package interview.datastructures.sorting;
class Print11{
		 boolean flag=false;
		public synchronized void Mymethododd(int number){
	 		System.out.println("flag"+flag+number);
	 		if(flag==true){				
			System.out.println(flag);
					try {
						
						wait();
						//wait();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
	 		}System.out.println("printing by Thread odd:"+Thread.currentThread().getName()+": "+number);
	 		flag=true;
	 		notifyAll();
	 	}
		public synchronized void MymethodEven(int number){
	 		System.out.println("flag"+flag+number);
	 			if(flag==false){try {
						
						wait();
						//wait();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 		
	 	}System.out.println("printing by Thread even:"+Thread.currentThread().getName()+": "+number);
		flag=false;
		notifyAll();
		}}
 
 class MyThread2 extends Thread 
 {
		int i=1;
		 boolean iseven;
		Print11 p;
		 
	 public MyThread2(int i, boolean iseven,Print11 print) {
		super();
		this.i = i;
		this.iseven = iseven;
		p=print;
	}
	
 	public    void run() 
 	{int j=1;
 	
 		if(iseven){
 			j=2;}
 			while(j<i){ 	
 		if(iseven) 	{		
 			p.MymethodEven(j);}
 		else{
 			p.Mymethododd(j);}
 		j=j+2;
 			}
 		
 	}
 	
 	
 	
 }
public class MyThreadDemo
{
	public static void main(String[] args)
	{Print11 p =new Print11();
		MyThread2 t1=new MyThread2(20, false,p);
		
		
		t1.setName("First Thread");
		
		MyThread2 t2=new MyThread2(20, true,p);
		t2.setName("Second Thread");
		t1.start();
		t2.start();
		
		//t.interrupt();		         
		System.out.println("end of main thread");
	}
}
