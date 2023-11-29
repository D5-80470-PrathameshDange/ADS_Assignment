
public class DCLL {
	public static class Node{
		int data;
		Node prev , next;
		public Node(int d)
		{
			this.data = d;
			prev = null;
			next = null;
		}
	}
	Node head;
	public DCLL() {
		head = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void fDisplay()
	{
		if(isEmpty())
			return;
		Node trav = head;
		do {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}while(trav != head);
		System.out.println("");
	}
		
	public void addFirst(int v)
	{
		Node nn = new Node(v);
		if(isEmpty()) {
			head = nn;
			nn.next = nn;
			nn.prev = nn;
		}
		else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn; 
			head = nn;
		}
		
	}
	public void addLast(int d) {
		Node nn = new Node(d);
		if(isEmpty()) {
			head = nn;
			nn.next = head;
			nn.prev = head;
		}
		else {
			head.prev.next = nn;
			nn.prev = head.prev;
			nn.next = head;
			head.prev = nn;
		}
		
	}
	public void addPosition(int pos, int data) {
		Node nn = new Node(data);
		if(isEmpty())
		{
			head = nn;
			nn.next = head;
			nn.prev = head;
		}
		else if(pos <= 1) {
			addFirst(data);
		}
//		else if(pos > count+1) {
//			addLast(data);
//		}
		else {
			Node trav = head;
			for(int i=1; i<=pos-1  ; i++) {
				trav = trav.next;
			}
			nn.next = trav;
			nn.prev = trav;
			trav.prev.next = nn;
			trav.prev = nn;
		}
	}
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next == head) {
			head = null;
		}
		else {
		head.prev.next = head.next;
		head.next.prev = head.prev;
		head = head.next ;
		
		}
	}
	public void deleteLast() {
		if(isEmpty()) {
			return;
		}
		else if(head.next == head) {
			head = null;
		}
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			Node t = head;
			for(int i=1 ; i<= pos-1 ; i++)
				t = t.next;
			t.prev.next = t.next;
			t.next.prev = t.prev;
		}
	}

}





























