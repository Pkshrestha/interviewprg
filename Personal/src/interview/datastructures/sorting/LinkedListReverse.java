package interview.datastructures.sorting;

public class LinkedListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertAtStart(5);
		list.insertAtStart(9);

		list.insertAtStart(11);
		
	list.traverse();
list.delete(9);
list.traverse();
		//list.insertAtStart(4);
		/*list.addAtPosition(19, 2);
		list.insertAtEnd(7);
		list.insertAtEnd(8);
		list.traverse();
		list.reverse();
		list.traverse();*/
		System.out.println(list.findmiddleinoneparse());
		
	}

}


class LinkedList {
	Node start;
	Node end;
	int size;
	
	public void delete(int deletenode){
		Node n= start;
		
		if(start.next!=null){
		while(n.next!=null ){
			if(n.next.getValue()==deletenode){
			if(n.getNext().getNext()!=null)
			n.setNext(n.getNext().getNext());
			else n.setNext(null);
			break;}
			n=n.getNext();
			
		}}
		else start=null;
		}
	
	public int findmiddleinoneparse(){
		Node n= start;
		Node p=n;
		
		if(n.next!=null ){
			
			
			while(p.next!=null &&  p.next.next!=null){
				
			p=p.getNext().getNext();
			n=n.getNext();}
			
			}
		if(p.next!=null){
			return n.getNext().getValue();
		}
		return n.getValue();
	}
	
	
	
	public void reverse(){
		Node currNode=start;
		Node prevNode=null;
		Node nextNode=null;
				
		  while(currNode!=null){
			     nextNode = currNode.next;
			     currNode.next = prevNode;
			     prevNode = currNode;
			     currNode = nextNode;
			}
		  end=start;
		  start=prevNode;
	}
	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public void insertAtEnd(int value) {
		Node n = new Node(value, null);
		if (start == null) {
			start = n;
			end = start;
		} else {
			end.next = n;
			end = n;
		}
		size++;

	}

	public void insertAtStart(int value) {
		Node n = new Node(value, null);
		if (start == null) {
			start = n;
			end = start;
		} else {
			n.next = start;
			start = n;

		}
		size++;
	}

	public void traverse() {
		Node pointer = start;
		for (int i = 0; i < size; i++) {

			System.out.println(pointer.value);
			pointer = pointer.next;

		}
	}

	public void addAtPosition(int value, int position) {
		position = position - 1;
		if (size > position) {
			Node ptr = start;
			for (int i = 0; i < size; i++) {

				if (i == position) {
					Node n = new Node(value, ptr.getNext());
					ptr.next = n;
					break;
				}
				ptr = ptr.getNext();
			}

			size++;
		}
	}

}

class Node {
	Node next;
	int value;

	public Node() {
	}

	public Node(int value, Node next) {
		this.next = next;
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}