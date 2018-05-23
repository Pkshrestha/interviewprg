package interview.datastructures.sorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class MaxResoureUsed {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
List<Resource> list=new ArrayList<Resource>();
list.add(new Resource(sdf1.parse("2:03"),sdf1.parse("2:05"),3,111));
list.add(new Resource(sdf1.parse("2:04"),sdf1.parse("2:05"),2,333));
list.add(new Resource(sdf1.parse("2:15"),sdf1.parse("2:30"),2,222));

//list.add(new Resource(sdf1.parse("12:12"),sdf1.parse("12:12"),3));

for(int i=1;i<=list.size();i++){
	getAllcombination(list,list.size(),i,new ArrayList<Resource>(),-1);
}
List<Resource> resultList=null;
int resourcused=0;int resourcused1=0;
for (List<Resource> resourcelist : mylist) {
	resourcused=0;resourcused1=0;
	List<Resource> myList=new ArrayList();
	Date lastEndtime=sdf1.parse("0:00");
	Date lastStarttime=sdf1.parse("0:00");
	for (Resource resource : resourcelist) {
		System.out.println(resource.getStarttime().compareTo(sdf1.parse("2:00")));
		if((resource.getStarttime().compareTo(sdf1.parse("2:00"))>=0)&&(resource.getEndTime().compareTo(sdf1.parse("3:00"))<=0)){
			Boolean b=true;
			for (Resource resource1 : resourcelist) {
				if((resource1.endTime.compareTo(resource.starttime)<=0)|| (resource1.starttime.compareTo(resource.getEndTime())>=0)){
				b=false;
			}}
			if((b && lastEndtime.compareTo(resource.starttime)<=0)|| (lastStarttime.compareTo(resource.getEndTime())>=0)){
				resourcused+=resource.getResource();
			}
			else
				break;
			//myList.add(resource);
			
		}
		else break;
		if(resourcused>=resourcused1){
			resourcused1=resourcused;
			resultList=resourcelist;
			
		}
	}//System.out.print(resourcused);System.out.println();
	
}
for (Resource resource : resultList) {
	System.out.println(resource.getId()+" : "+resource.getStarttime()+" : "+resource.endTime);
	
}
System.out.println(resourcused);

	}
static List<List<Resource>> mylist=new ArrayList<List<Resource>>();
	private static int getAllcombination(List<Resource> list, int size, int i,
			List<Resource> arrayList,int k) {
		// TODO Auto-generated method stub
		if(i==0){
			mylist.add(arrayList);
			
			return 0;
		}
		for(int j=k+1;j<list.size();j++){
			List<Resource> nelist=new ArrayList<Resource>();
			nelist.add(list.get(j));
			nelist.addAll(arrayList);
			
			getAllcombination(list, size, i-1,nelist,j );
		}
		return 0;
	}

}
class Resource{
int id;
Date starttime;
Date endTime;
int resource;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getStarttime() {
	return starttime;
}
public void setStarttime(Date starttime) {
	this.starttime = starttime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public int getResource() {
	return resource;
}
public void setResource(int resource) {
	this.resource = resource;
}
public Resource(Date starttime, Date endTime, int resource,int id) {
	super();
	this.starttime = starttime;
	this.endTime = endTime;
	this.resource = resource;
	this.id=id;
}

}