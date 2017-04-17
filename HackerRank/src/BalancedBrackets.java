import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

public static boolean isBalanced(String expression) {
	
	if(expression.isEmpty())
		return false;
	Stack<Character> stack = new Stack<Character>();
	char[] arr = expression.toCharArray();
	for(char ch : arr){
		if(!stack.isEmpty() && ch == ')'){
			char  val = stack.peek();
			if(val == '('){
				stack.pop();
			}
		} 
		else if(!stack.isEmpty() && ch == '}'){
			char  val = stack.peek();
			if(val == '{'){
				stack.pop();
			}
		}
		else if(!stack.isEmpty() && ch == ']'){
			char  val = stack.peek();
			if(val == '['){
				stack.pop();
			}
		}
		else {
			stack.push(ch);
		}
	}
	if(stack.isEmpty())
		return true;
	else
	return false;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

}
