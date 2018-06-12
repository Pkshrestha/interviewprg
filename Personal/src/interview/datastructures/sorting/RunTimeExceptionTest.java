package interview.datastructures.sorting;

public class RunTimeExceptionTest extends  Throwable{
	public RunTimeExceptionTest(String argExc){
		super(argExc);
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
myMethods();
	}
public static void myMethods(){
	
	try {
		throw new  RunTimeExceptionTest("my Exception");
	} catch (RunTimeExceptionTest e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
