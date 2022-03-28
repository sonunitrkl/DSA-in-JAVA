package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class IsPalindrome {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        System.out.println(checkPalindrome(head));
    }

    private static boolean checkPalindrome(Node head) {
        Node mid = MiddleOfLinkedList.getMiddleNode(head);
        Node revNode = LinkedList.reverseLinkedList(mid.next);
        while(null != head && head != mid && revNode != null){
            if(head.data != revNode.data) return false;
            head = head.next;
            revNode = revNode.next;
        }
        return true;
    }
}
