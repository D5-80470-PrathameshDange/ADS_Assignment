
public class SLLL {
	static class Node{
		private int data;
		private Node next;
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	private Node head;
	public SLLL()
	{
		head = null;
	}
	public boolean isEmpty()
	{
		return head == null;
	}
	public void addFirst(int value)
	{
		Node newNode = new Node(value);
		if(isEmpty())
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void addPosition(int pos, int value)
	{
		Node newnNode = new Node(value);
		if(isEmpty())
			head = newnNode;
		else if(pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			for(int i=1 ; i < pos-1 && trav.next != null ; i++)
				trav = trav.next;
			newnNode.next = trav.next;
			trav.next = newnNode;
		}
	}
	public void addLast(int value)
	{
		Node newnNode = new Node(value);
		if(isEmpty())
			head = newnNode;
		else {
		Node trav = head;
		while(trav.next != null)
			trav = trav.next;
		trav.next = newnNode; 
		}
	}
	public void deleteFirst()
	{
		if(isEmpty())
			return;
		else
			head = head.next;
	}
	public void deleteLast()
	{
		if(isEmpty())
			return;
		else if(head.next == null)
			head = null;
		else {
			Node trav = head;
			while(trav.next.next != null )
				trav = trav.next;
			trav.next = null;
		}
	}
	public void deletePosition( int pos )
	{
		if(isEmpty())
			return ;
		else if( pos <= 1)
			deleteFirst();
		else {
			Node trav = head;
			for(int i=1 ; i < pos-1 && trav.next.next != null ; i++)
				trav = trav.next;
			trav.next = trav.next.next;
		}
	}
	public void addPositionAhead(int pos, int data) {
		Node nn = new Node(data);
		if(isEmpty())
			head = nn;
		else if(pos < 1)
			addFirst(data);
		else {
			Node trav = head;
			for(int i=1 ; i <= pos-1 ; i++)
				trav = trav.next;
			nn.next = trav.next;
			trav.next = nn;
		}
	}
	public void addPositionBehind(int pos, int data) {
		int count=1;
		Node nn = new Node(data);

		Node trav = head;
		while(count < pos -1) {
			trav = trav.next;
			count++;
		}
		nn.next = trav.next;
			trav.next = nn;
	}
	
	public void display() {
		System.out.println("Forward display : ");
		Node trav = head;
		while(trav != null)
		{
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
	public void rDisplay(Node trav) {
		
		if(trav == null)
			return;
		rDisplay(trav.next);
		System.out.print(" " + trav.data);
	}
	public void rDisplay() {
		Node trav = head;
		System.out.println("Reverse display : ");
		rDisplay(trav);
	}
	public void addValue(int value) {
		Node trav = head;
		int cnt=1;
		Node tail = head;
		int temp = trav.data;
		while(value > temp ) {
			trav = trav.next;
			temp = trav.data;
//			if(value >= temp) {
//				tail = trav;
//			}
			cnt++;
			tail = trav;
			
		}
//		if(value >= tail.data) {
//			addLast(value);
//			cnt++;
//		}
		Node nn = new Node(value);
			addPosition(cnt, value);

	}
	
}



















