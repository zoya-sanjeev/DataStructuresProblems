import java.util.Scanner;

import com.bridgelabz.stacksandqueues.*;
public class BalancedParentheses {
	
	static boolean checkParentheses(String expression) {
		MyStack<Character> stack=new MyStack<>();
		for(int index=0;index<expression.length();index++) {
			if(expression.charAt(index)=='(') {
				Node<Character> node = new Node(expression.charAt(index));
				stack.push(node);
			}
			if(expression.charAt(index)==')') {
				INode<Character> val=stack.pop();
			}
		}
		if(stack.size()==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter arithmethic expression");
		String expression=scanner.next();
		if(checkParentheses(expression))
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
	}

}
