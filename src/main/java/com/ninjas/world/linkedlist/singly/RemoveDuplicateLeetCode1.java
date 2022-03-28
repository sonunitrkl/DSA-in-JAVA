package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class RemoveDuplicateLeetCode1 {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        LinkedList.printLinkedList(removeDuplicate(head));
    }

    private static Node removeDuplicate(Node head) {
        Node prev = null, curr = head, resHead = null, resTail = null;
        while (curr != null) {
            if (prev == null) {
                prev = curr;
                curr = curr.next;
                resHead = head;
                resTail = head;
            } else {
                if (prev.data == curr.data) {
                    // prev = curr;
                    if(curr.next == null){
                        resTail.next = null;
                        return resHead;
                    }
                    curr = curr.next;
                } else {
                    resTail.next = curr;
                    resTail = resTail.next;
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return resHead;
    }
}
