import java.util.Scanner;

import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.linkedlist.SortedLinkedList;

public class OrderedList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers");
		String[] input=scanner.nextLine().split(" ");
		SortedLinkedList<Integer> mySortedList=new SortedLinkedList<>();
		for(int index=0;index<input.length;index++) {
			MyNode<Integer> node=new MyNode<>(Integer.parseInt(input[index]));
			mySortedList.add(node);
		}
		System.out.println("Enter key to search");
		int key=scanner.nextInt();
		int found=mySortedList.search(key);
		if(found==0) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Found");
			mySortedList.deleteNode(key);
		}
		mySortedList.printList();

	}

}
