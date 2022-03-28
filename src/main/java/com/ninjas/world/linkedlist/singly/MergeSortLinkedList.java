package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class MergeSortLinkedList {

    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        LinkedList.printLinkedList(sortList(head));
    }

    public static Node merge(Node head1, Node head2) {
        Node res = null;
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1.data <= head2.data) {
            res = head1;
            res.next = merge(head1.next, head2);
        } else {
            res = head2;
            res.next = merge(head1, head2.next);
        }
        return res;
    }

    public static Node getMiddleNode(Node head){
        if(null == head) return null;
        Node slow = head, fast = head.next;
        while(null != fast.next && null != fast.next.next){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        Node mid = getMiddleNode(head);
        System.out.print("mid :: " );
        LinkedList.printLinkedList(head);
        Node midnext = mid.next;
        mid.next = null;
        Node node1 = sortList(head);
        Node node2 = sortList(midnext);
        return merge(node1, node2);
    }
}
