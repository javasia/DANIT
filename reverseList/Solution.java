package reverseList;

import java.util.*;

public class Solution {

    public static class Node {
        Node next = null;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node reverse(Node head) {

        Node reversed = new Node(head.val);

        while (head != null){
            reversed.next = new Node(reversed.val);
            reversed.val = head.val;
            head = head.next;
        }

        return reversed;
    }

    public static void main(String[] args) throws Exception {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner("4\n" +
                "1 5 6 7");
        printList(reverse(readList(in)));
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