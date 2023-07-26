import java.io.*; 
import java.util.*; 

class reverse {
	public int CalculateExpression(String[] tokens)
	{ 
		Stack<String> stack = new Stack<String>(); 
		int x, y; 
		String result = "";
		String choice; 
		int value = 0; 
		String Concatenate = "";
 
		for (int i = 0; i < tokens.length; i++) { 
			if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                stack.push(tokens[i]); 
                System.out.println(stack);
				continue; 
			} 
			else { 
                choice = tokens[i]; 
                System.out.println(choice);
			} 

			// Switch-Case 
			switch (choice) { 
			case "+": 
				x = Integer.parseInt(stack.pop()); 
				y = Integer.parseInt(stack.pop()); 
				value = x + y; 
				result = Concatenate + value;
                stack.push(result); 
                System.out.println(stack);
				break; 

			case "-": 
				x = Integer.parseInt(stack.pop()); 
				y = Integer.parseInt(stack.pop()); 
				value = x - y; 
				result = Concatenate + value;
                stack.push(result); 
                System.out.println(stack);
				break; 

			case "*": 
				x = Integer.parseInt(stack.pop()); 
				y = Integer.parseInt(stack.pop()); 
				value = x * y; 
				result = Concatenate + value;
                stack.push(result); 
                System.out.println(stack);
				break; 

			case "/": 
				x = Integer.parseInt(stack.pop()); 
				y = Integer.parseInt(stack.pop()); 
				value = y / x; 
				result = Concatenate + value;
                stack.push(result); 
                System.out.println(stack);
				break; 

			default: 
				continue; 
			} 
		} 
		return Integer.parseInt(stack.pop()); 
    } 
    
    
} 

class Question_2 { 
	public static void main(String[] args) 
	{
		String[] stringbreaker = {"2","5","+","10","*"};
		reverse rev = new reverse();
		int result = rev.CalculateExpression(stringbreaker);
		System.out.println(result); 
	} 
}
