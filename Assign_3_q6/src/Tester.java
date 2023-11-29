
public class Tester {
	public static int priority(char opr)
	{
		switch (opr) {
		case '$' : return 10;
		case '*' : return 9;
		case '/' : return 9;
		case '%' : return 9;
		case '+' : return 8;
		case '-' : return 8;
		}
		return 0;
	}
	
	public static String infixToPostfix(String infix)
	{
		Stack st = new Stack(10);
		String crr[] = infix.split(" ");
		StringBuilder postfix = new StringBuilder();
		
		for(int i=0 ; i < crr.length ; i++)
		{
			try
			{
				int n = Integer.parseInt(crr[i]);
				String s1 = Integer.toString(n);
				postfix.append(s1+" ");
			}catch (Exception e) {
				String str = crr[i];
				char ch = str.charAt(0);
				if(ch == '(')
					st.push(ch);
				else if(ch == ')') {
					while(st.peek() != '(')
						postfix.append(st.pop()+" ");
				st.pop();
			}
				else {
					while(!st.isEmpty() && priority(st.peek()) >= priority(ch))
					{
						postfix.append(st.pop()+" ");
					}
					st.push(ch);
				}
			}
		}
		while(!st.isEmpty())
			postfix.append(st.pop()+" ");
		return postfix.toString();
	}
	public static String infixToPrefix(String infix)
	{
		Stack st = new Stack(10);
		StringBuilder prefix = new StringBuilder();
		String[] crr = infix.split(" ");
		
		for(int i=crr.length-1 ; i >= 0 ; i--)
		{
			try {
				int n = Integer.parseInt(crr[i]);
				String s1 = Integer.toString(n);
				StringBuilder s = new StringBuilder(s1);
				s.reverse();
				prefix.append(s + " ");
			}catch (Exception e) {
				String str = crr[i];
				char ch = str.charAt(0);
				if(ch == ')')
					st.push(ch);
				else if(ch == '(') {
					while(st.peek() != ')') {
						prefix.append(st.pop());
					
					}
					st.pop();
				}
				else {
					while(!st.isEmpty() && priority(st.peek()) > priority(ch))
						prefix.append(st.pop());
					
					st.push(ch);
				}
			}
		}
		while(! st.isEmpty())
			prefix.append(st.pop());
		
		prefix.reverse();
		return prefix.toString();
	}
	
	
	public static void main(String[] args) {
		String infix = "( 10 + 40 ) - 50";
		System.out.println("Infix: "+infix);
		String res = infixToPostfix(infix);
		System.out.println("Postfix: "+res);
		
		res = infixToPrefix(infix);
		System.out.println("Prefix : "+res);
	}

}
