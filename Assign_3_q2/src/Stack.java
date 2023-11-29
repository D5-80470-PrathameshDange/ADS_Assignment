
public class Stack {
	int arr[];
	int size;
	int top;
	public Stack(int size)
	{
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	public void push(int data)
	{
		top++;
		arr[top] = data;
	}
	public int pop()
	{
		int data = arr[top];
		top --;
		return data;
	}
	public int peek()
	{
		return arr[top];
	}
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if(top == arr.length - 1)
			return true;
		else
			return false;
	}
}

