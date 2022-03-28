package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class SwapNodesInPair {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        LinkedList.printLinkedList(swap(head));
    }

    private static Node swap(Node head) {
        Node prev = head, curr = head.next;
        return null;
    }
}
