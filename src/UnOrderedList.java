import java.util.Scanner;

import com.bridgelabz.linkedlist.*;

public class UnOrderedList {
	
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String sentence=scanner.nextLine();
		String[] words=sentence.split(" ");
		LinkedList<String> myLinkedList=new LinkedList<>();
		for(String word: words) {
			MyNode<String> node=new MyNode<>(word);
			myLinkedList.add(node);
		}
		System.out.println("Enter word to search");
		String key=scanner.next();
		int found=myLinkedList.search(key);
		if(found==0) 
			System.out.println(key+" not found");
		else {
			System.out.println(key +" found");
			myLinkedList.deleteNode(key);
			myLinkedList.printNodes();
		}

	}

}
