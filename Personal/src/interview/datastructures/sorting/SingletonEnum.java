package interview.datastructures.sorting;

import java.io.Serializable;

public enum SingletonEnum implements Cloneable,Serializable{
	
Instance;

public static void mymethod(){
	System.out.println("this is Enum singleton");
}

public static void main(String ...args){
	mymethod();
}
}
