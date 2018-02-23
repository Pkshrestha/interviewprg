package interview.datastructures.sorting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*Class myclass= Class.forName("interview.datastructures.sorting.SingletonEnum");
		Constructor<SingleTon>[] con=myclass.getDeclaredConstructors();
		SingleTon singletone1=null;
		for (Constructor constructor : con) {
			constructor.setAccessible(true);
			singletone1=(SingleTon) constructor.newInstance();
			break;
		} 
		System.out.println(singletone1);*/
		SingletonEnum s1=SingletonEnum.Instance;
		SingletonEnum s2=SingletonEnum.Instance;
		s1.Instance.mymethod();
		//SingletonEnum s3=(SingletonEnum)s2.clone();
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
//System.out.println(s3);
ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("out.ser"));
os.writeObject(s2);
ObjectInputStream si=new ObjectInputStream(new FileInputStream("out.ser"));
SingletonEnum singleTone=(SingletonEnum) si.readObject();
System.out.println(singleTone.hashCode());


	
	
	}

}
