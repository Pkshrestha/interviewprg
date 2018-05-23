package interview.datastructures.sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

public class BulkFileReadingMultithreading {
	private static Map<String,Integer> map=new HashMap<String,Integer>();
	public static void main(String args []) throws IOException{
		Path path = Paths.get("demo.txt");
		long lineCount = Files.lines(path).count();
		System.out.println(lineCount);
		
		File file=new File("demo.txt");
		
		
		
		
		Thread m1=new Thread(new MyThreadReader(file,1,lineCount,map));
		m1.setName("1st Thread");
		Thread m2=new Thread(new MyThreadReader(file,2,lineCount,map));
		m2.setName("2nd Thread");
		Thread m3=new Thread(new MyThreadReader(file,3,lineCount,map));
		m3.setName("3rd Thread");
		Thread m4=new Thread(new MyThreadReader(file,4,lineCount,map));
		m4.setName("4th Thread");
		Thread m5=new Thread(new MyThreadReader(file,0,lineCount,map));
		m5.setName("5th Thread");
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		
		for (Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : Count"+entry.getValue());
		}
		
	}
	

}

class MyThreadReader implements Runnable{
private File file;
private int i;
private long lineCount;
private Map<String,Integer> map=new HashMap<String,Integer>();	

	public MyThreadReader(File file, int i, long lineCount,Map<String,Integer> map) {
	super();
	this.file = file;
	this.i = i;
	this.lineCount = lineCount;
	this.map = map;
}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int j=i;j<lineCount;j=j+5){
			String line = (String) FileUtils.readLines(file).get(j);
			String []linearray=line.split(" ");
			
			for (String string : linearray) {
			if(map.containsKey(string)){map.put(string, map.get(string)+1);}
			else{
				map.put(string,1);
			}
			}
			System.out.println(line+"  :Reading by thread "+Thread.currentThread().getName());
			}} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
