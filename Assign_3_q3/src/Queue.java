
public class Queue {
	int arr[];
	int front,rear, size;
	public Queue(int size)
	{
		this.size = size;
		arr = new int[size];
		rear = front = 0;
	}
	public void push(int data)
	{
		rear++;
		arr[rear] = data;
	}
	public int pop()
	{
		int value = arr[front+1];
		front++;
		
		return value;
	}
	public int peek()
	{
		int val = arr[front + 1];
		front++;
		return val;
	}
	public boolean isEmpty()
	{
		return front == rear;
	}
	public boolean isFull()
	{
		return rear == size -1;
	}
	
}
