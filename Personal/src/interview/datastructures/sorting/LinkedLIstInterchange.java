package interview.datastructures.sorting;

public class LinkedLIstInterchange {

	public static void main(String[] args) {
		int[] c={88,89,90,91};
		String s=new String(c,1, 3);
		System.out.println(s);
		// TODO Auto-generated method stub
		LinkedList li=new LinkedList();
		li.insertAtEnd(1);
		li.insertAtEnd(2);
		li.insertAtEnd(3);
		li.insertAtEnd(4);
		li.insertAtEnd(5);
		li.insertAtEnd(6);
		li.insertAtEnd(7);
		li.insertAtEnd(8);
		li.insertAtEnd(9);
		li.traverse();

interchange(li,li.start,new Node());

li.traverse();

	}

	private static int interchange(LinkedList li,Node startnode,Node prevnode) {
		// TODO Auto-generated method stub
	//	Node node=li.start;
		if(startnode.next==null || startnode.next.next==null){
			return 0;
		}
			
			Node node1=startnode;
			Node node2=startnode.next;
			node1.next=node2.next;
			prevnode.next=node2;
			startnode=node2;
			node2.next=node1;
			//node=node.next;
			if(li!=null)li.start=startnode;
			LinkedList li1=null;
			interchange(li1,node1.next,node1);
	return 0;
		//interchange(node2);
	}

}
