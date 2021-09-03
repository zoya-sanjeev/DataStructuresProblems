import java.util.Scanner;

import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.linkedlist.SortedLinkedList;
import com.bridgelabz.stacksandqueues.Node;

public class HashFunction {

	public static void main(String[] args) {
		SortedLinkedList<Integer>[] linkedLists = new SortedLinkedList[11];
		for(int index=0;index<11;index++) {
			linkedLists[index] = new SortedLinkedList<Integer>();
		}
		String input = "12 32 1 33 56 34 73";
		String numbers[] = input.split(" ");
		for(int i=0;i<numbers.length;i++) {
			int number = Integer.parseInt(numbers[i]);
			int index = getIndex(number);
			linkedLists[index].add(new MyNode(number));
		}
		
		printArrays(linkedLists);
		
		System.out.println("Enter number to search:");
		Scanner scanner = new Scanner(System.in);
		int key = Integer.parseInt(scanner.nextLine());
		int keyIndex = getIndex(key);
		if(linkedLists[keyIndex].search(key)!=0) {
			linkedLists[keyIndex].deleteNode(key);
			printArrays(linkedLists);
		} else {
			linkedLists[keyIndex].add(new MyNode(key));
			linkedLists[keyIndex].printList();
			printArrays(linkedLists);
		}
	}
	
	public static void printArrays(SortedLinkedList<Integer>[] linkedLists) {
		for(int i=0;i<11;i++) {
			System.out.print(i+" --> ");
			linkedLists[i].printList();
		}
	}
	
	public static int getIndex(int number) {
		return number%11;
	}

}
