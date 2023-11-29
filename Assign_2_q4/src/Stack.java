
public class Stack {
	int arr[];
	int top;
	int size;
	public Stack(int size) {
		this.size = size;
		arr = new int [size];
		top = size;
	}
	void push(int value)
	{
		top--;
		arr[top] = value;
	}
	void pop()
	{
		top++;
	}
	int peek()
	{
		return arr[top];
	}
	boolean  isFull()
	{
		return top == 0;
	}
	boolean isEmpty()
	{
		return top == size;
	}
	
	
}
