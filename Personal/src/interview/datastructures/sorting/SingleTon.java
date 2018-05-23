package interview.datastructures.sorting;

import java.io.Serializable;

public class SingleTon implements Cloneable,Serializable {
	private static SingleTon singletone=null;
	private static boolean flag=false;
	
	private SingleTon(){

if(singletone != null){
            throw new RuntimeException("Cannot create. Please use getInstance()");
} 
else if(flag==false){
	  throw new RuntimeException("Cannot create. Please use getInstance()");
}

		
	}
	public static SingleTon getInstance(){
		if(singletone==null)
			synchronized (SingleTon.class) {
				if(singletone==null){
					flag =true;
					singletone=new SingleTon();
					flag= false;
				}
				
				
			}
		return singletone;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//throw new CloneNotSupportedException();
		return this.singletone;
	}
	protected Object readResolve() {
		  return singletone;
		}

}