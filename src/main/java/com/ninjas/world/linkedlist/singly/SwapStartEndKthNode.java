package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class SwapStartEndKthNode {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        LinkedList.printLinkedList(swap(head,2));
    }

    private static Node swap(Node head, int k) {
        int count = 1;
        Node slow = head, fast = head, startkthNodebefore  = null;
        while(count < k){
            if(count == k-1) startkthNodebefore = fast;
            fast = fast.next;
            count ++;
        }
        while(fast.next.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        Node startkthnode = startkthNodebefore.next, endkthnode = slow.next;
        startkthNodebefore.next = endkthnode;
        endkthnode.next = startkthnode.next;

        slow.next = startkthnode;
        startkthnode.next = slow.next.next;
        return head;
    }
}
