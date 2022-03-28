package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class MergeTwoSortedLinkList {
    public static void main(String[] args) {
        Node head1 = LinkedList.takeInput();
        Node head2 = LinkedList.takeInput();
        LinkedList.printLinkedList(merge(head1,head2));
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
}
