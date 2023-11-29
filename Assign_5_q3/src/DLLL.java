
public class DLLL {
	public static class Node{
		int data;
		Node prev;
		Node next;
		public Node(int d) {
			this.data = d;
			prev = next = null;
		}
	}
	Node head, tail;
	public DLLL() {
		head = tail = null;
	}
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head = tail = nn;
		else {
			nn.next = head;
			head.prev = nn;
			head = nn;
			}
		}
	public void addLast(int val) {
		Node nn = new Node(val);
		if(isEmpty())
			head = tail = nn;
		else {
			nn.prev = tail;
			tail.next = nn;
			//head = nn;
			tail = nn;
		}
	}
	public void addPosition(int pos, int val) {
		Node nn = new Node(val);
		if(pos == 1)
			addFirst(val);
		else {
			Node trav = head;
			for(int i=1 ; i < pos-1 ; i++) {
				trav = trav.next;
			}
			nn.prev = trav;
			nn.next = trav.next;
			trav.next = nn;
			nn.next.prev = nn;
		}
	}
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next==null) {
			head = tail = null;
		}
		else {
			head = head.next;
			head.prev = null;
		}
	}
	public void deleteLast()
	{
		if(isEmpty())
			return;
		else if(head.next == null)
			head = tail = null;
		else {
			tail = tail.prev;
			tail.next = null;
			
		}
	}
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(head.next == null)
			head = tail = null;
		else {
			Node trav = head;
			for(int i=1 ; i<pos ; i++)
				trav = trav.next;
			trav.prev.next = trav.next;
			trav.next.prev = trav;
		}
	}
	public void fdisplay() {
		Node trav = head;
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
}

































