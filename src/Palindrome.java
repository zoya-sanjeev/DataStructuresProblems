import java.util.Scanner;

import com.bridgelabz.stacksandqueues.*;
public class Palindrome {
	
	public static boolean checkPalindrome(String str) {
		DEQueue<Character> dequeue=new DEQueue<>();
		for(int index=0;index<str.length();index++) {
			Node<Character> newnode=new Node<>(str.charAt(index));
			dequeue.addRear(newnode);
		}
		
		StringBuffer buffer = new StringBuffer();
		for(int index=0;index<str.length();index++) {
			INode<Character> node=dequeue.deleteRear();
			Character c=node.getKey();
			buffer.append(c);
		}
		
		String result = buffer.toString();
		return result.equals(str);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scanner.nextLine();
		if(checkPalindrome(input.toLowerCase())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
