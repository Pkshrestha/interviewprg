package interview.datastructures.sorting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonTesting{

	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class myclass= Class.forName("interview.datastructures.sorting.SingleTone");
		Constructor<SingleTon>[] con=myclass.getDeclaredConstructors();
		SingleTon singletone1=null;
		for (Constructor constructor : con) {
			constructor.setAccessible(true);
			singletone1=(SingleTon) constructor.newInstance();
			break;
		} 
		System.out.println(singletone1);
		SingleTon s1=SingleTon.getInstance();
		SingleTon s2=SingleTon.getInstance();
		SingleTon s3=(SingleTon)s2.clone();
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("out.ser"));
os.writeObject(s2);
ObjectInputStream si=new ObjectInputStream(new FileInputStream("out.ser"));
SingleTon singleTone=(SingleTon) si.readObject();
System.out.println(singleTone);


	
	
	}
	

}
