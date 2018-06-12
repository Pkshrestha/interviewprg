package interview.datastructures.sorting;

import java.util.Scanner;

public class ExceptionQuestions {

	public static void main(String[] args) throws Exception  {
		
		
			
				try {
					method1();
				} catch (UserCredential e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			 try {
				method2();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 method3();
		 
		// TODO Auto-generated method stub
		

}

	private static void method3() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("From method3");
	}

	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("From method2");	
	}

	private static void method1() throws UserCredential {
		// TODO Auto-generated method stub
		throw new UserCredential();
		//throw new Exceptin("User credential failed");
	}
}
	class UserCredential extends Exception{
		UserCredential(){
			super("Invalid login");}
	}
		
	
