

public class Stack {
	char arr[];
	int size;
	int top;
	public Stack(int size)
	{
		this.size = size;
		arr = new char[size];
		top = -1;
	}
	public void push(char data)
	{
		top++;
		arr[top] = data;
	}
	public char pop()
	{
		char data = arr[top];
		top --;
		return data;
	}
	public char peek()
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

