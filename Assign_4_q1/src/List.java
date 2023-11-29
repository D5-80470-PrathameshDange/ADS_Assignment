
public class List {
	static class Node{
		private int data;
		private Node next ;
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	Node tail;
	Node head;
	public List()
	{
		head = null;
		tail = null;
	}
	public boolean isEmpty()
	{
		return head == null && tail == null;
	}
	public void addFirst(int val)
	{
		Node newnNode = new Node(val);
		Node trav = head;
		if(isEmpty()) {
			head = newnNode;
			tail = head;
		}
		else {
			newnNode.next = head;
			head = newnNode;
		}
	}
	public void addLast(int val)
	{
		Node newnNode = new Node(val);
		if(isEmpty()) {
			head = newnNode;
			tail = head;
			return;
		}
		else if(head.next == null) {
			addFirst(val);
		}
		else
		{
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newnNode;
		}
			tail = newnNode;
	}
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next == null)
		{
			head = null;
		    tail = null;
		}
		else
			head = head.next;
	}
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next == null) {
			head = tail = null;
		}
		else {
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			trav.next=null;
			tail = trav;
			
		}
		}

	public void display() {
		Node trav = head;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != null);
		}
		
		
	
}


































