/**
 * Homework2
 * 
 * @author Andrii Danchenko FS6
 */
import java.util.*;

public class ArrayListMerge {

	public static class Node {
		Node next = null;
		int val;

		public Node(int val) {
			this.val = val;
		}
	}

	public static Node solve(Node first, Node second) {
		
		while (second != null) {

			if (first.val >= second.val) {
				second.next = first;
			} 
			second = second.next;
		}
		return first;
	}
	
	private static Node addSorted(Node elements) {
		
		
		return null;
	}

	public static void main(String[] args) throws Exception {
		String input = " 9\r\n" + 
				"0 9 19 21 29 34 37 43 48\r\n" + 
				"2\r\n" + 
				"9 11";
		Scanner sc = new Scanner(input);
		printList(solve(readList(sc), readList(sc)));
		sc.close();
	}

	public static Node readList(Scanner in) {
		int N = in.nextInt();
		Node head = new Node(-1);
		Node node = head;

		for (int i = 0; i < N; i++) {
			node.next = new Node(in.nextInt());
			node = node.next;
		}

		return head.next;
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
