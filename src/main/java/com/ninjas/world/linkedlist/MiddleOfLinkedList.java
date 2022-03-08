package com.ninjas.world.linkedlist;

/**
 * @author Sonu Kumar
 */
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        System.out.println(getMiddleNode(head).data);
    }
    public static Node getMiddleNode(Node head){
        if(null == head) return null;
        Node slow = head, fast = head;
        while(null != fast && null != fast.next){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
