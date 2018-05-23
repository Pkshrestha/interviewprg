package interview.datastructures.sorting.jdk1_8;

public class FunctionalInterfaceTest {

	

	public static void main(String ...args){
	/*	this is what with out lambda expression
	 myMethod(new InterfaceTest1(){
			@Override
		      public void log() {
		        System.out.println("Do work in SimpleFun impl...");
		      }

			@Override
			public void overrideme() {
				// TODO Auto-generated method stub
				
			}
		});*/
		
		/*we can use lambda expression to achive the above*/
		myMethod(() -> {
			int i=0;
			System.out.println(i);
			System.out.println("Do work in lambda exp impl...");
			});
	}
	 public static void myMethod(InterfaceTest1 sfi){
		    sfi.overrideme();
		  }
}
@FunctionalInterface
 interface InterfaceTest1{
	int value=0;
	void overrideme();
	//void overrideme2();
default void log(){
	System.out.println("I2 logging::");
}
default void log1(String str){
	System.out.println("I2 logging::"+str);
}
static void log11(String str){
	System.out.println("I2 logging::"+str);
}


/*default int  override1(){
	System.out.println("Prasanta kumar");
	return 0;
	}*/
}
@FunctionalInterface
interface InterfaceTest2{
	int value=0;
	void overrideme();
default void log(String str){
	System.out.println("I2 logging::"+str);
}


/*default int  override1(){
	System.out.println("Prasanta kumar");
	return 0;
	}*/
}