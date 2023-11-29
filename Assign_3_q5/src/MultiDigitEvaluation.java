
public class MultiDigitEvaluation {
	
	static int calculate(int op1, int op2, char opr)
	{
		switch (opr) {
		case '+':return  op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public static int postfixEvaluate(String postfix)
	{
		Stack st = new Stack(10);
		String[] crr = postfix.split(" ");
		for(int i=0 ; i < crr.length ; i++)
		{
			try {
				int n = Integer.parseInt(crr[i]);
				st.push(n);
			}
			catch (Exception e) {
				int op2 = st.pop();
				int op1 = st.pop();
				int r=0;
				try {
					String str = crr[i];
					char o = str.charAt(0);
					r = calculate(op1, op2, o);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				st.push(r);
			}
					
		}
		if(! st.isEmpty())
			return st.pop();
		return 0;
	}
	
	public static int prefixEvaluate(String prefix) 
	{
		Stack st = new Stack(10);
		String crr[] = prefix.split(" ");
		for(int i=crr.length-1 ; i >= 0 ; i--)
		{
			try {
				int n = Integer.parseInt(crr[i]);
				st.push(n);
			}catch (Exception e) {
				int op1 = st.pop();
				int op2 = st.pop();
				String str = crr[i];
				char o = str.charAt(0);
				int r=0;
				r = calculate(op1, op2, o);
				st.push(r);
				
			}
		}
		if(!st.isEmpty())
		{
			return st.pop();
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {
			String postfix = "10 40 + 50 -";
			
			int res = postfixEvaluate(postfix);
			System.out.println("Result : " + res);
			
			String prefix = "- + 10 40 50";
			res = prefixEvaluate(prefix);
			System.out.println("Result : " + res);

	}

}
