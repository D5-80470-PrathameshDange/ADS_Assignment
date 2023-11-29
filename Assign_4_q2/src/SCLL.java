
public class SCLL {
	static class Node{
		int data;
		Node next;
		public Node(int d)
		{
			this.data = d;
			next = null;
		}
	}
	Node tail;
	public SCLL()
	{
		tail = null;
	}
	public boolean isEmpty()
	{
		return tail == null;
	}
	public void addFirst(int data) {
		Node nn = new Node(data);
		if(isEmpty()) {
			tail = nn;
			tail.next=tail;
		}
		else {
			nn.next = tail.next;
			tail.next = nn;
		}
	}
	public void addLast(int val) {
		Node nn = new Node(val);
		if(isEmpty()) {
			tail = nn;
			//nn.next = tail.next;
			tail.next = nn;
		}
		else {
			nn.next = tail.next;
			tail.next = nn;
			tail = nn;
		}
	}
	public void deleteFirst() {
		if(isEmpty())
			return;
		tail.next = tail.next.next;
	}
	public void deleteLast() {
		if(isEmpty())
			return;
		else {
			Node trav = tail;
			while(trav.next.next!=tail.next)
				trav = trav.next;
			trav.next = tail.next;
			tail = trav;
		}
	}
	public void display() {
		Node trav = tail.next;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != tail.next);
		
	}
}
