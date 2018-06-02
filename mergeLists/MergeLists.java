package mergeLists;

import java.util.*;

public class MergeLists {

    public static class Node {
        Node next = null;
        int val;

        public Node (int val) {
            this.val = val;
        }
    }
    public static Node solve(Node first, Node second){
        if (first != null && second != null){
            solve (insert (first, second), second.next);
        }
        return first == null ? second : first;
    }

    private static Node insert (Node head, Node element){
        if (head.next == null){
            head.next = element;
        }else if (head.val >= element.val){
            Node temp = new Node (head.val);
            temp.next = head.next;
            head.val = element.val;
            head.next = temp;
        }else {
            head = insert (head.next, element);
        }
        return head;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner("6\n" +
//                "        1 6 7 8 10 11\n" +
//                "        5\n" +
//                "        2 3 6 10 12");

        printList(solve(readList(in), readList(in)));
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
