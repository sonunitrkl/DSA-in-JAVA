package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class GetDecimalVal {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        System.out.println(getDecimalValue(head));
    }
    public static int getDecimalValue(Node head) {
        Node rev = reverse(head);
        LinkedList.printLinkedList(rev);
        int pow = 1;
        int ans = 0;
        while(head != null){
            ans += pow*head.data;
            pow= pow*2;
            head = head.next;
        }
        return ans;
    }
    public static Node reverse(Node head){
        if(null == head || head.next == null) return head;
        Node ans = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return ans;
    }
}
