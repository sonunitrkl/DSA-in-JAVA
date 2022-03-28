package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class MergeKSortedLinkedList {
    public static void main(String[] args) {
        Node head1 = LinkedList.takeInput();
        Node head2 = LinkedList.takeInput();
        LinkedList.printLinkedList(mergeTwoLists(head1,head2));
    }
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node head = null, tail = null;
        Node temp1 = list1, temp2 = list2;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        while(temp1 != null && temp2 != null){
            if(temp1.data <= temp2.data){
                if(head == null){
                    head = temp1;
                    tail = temp1;
                    temp1 = temp1.next;
                } else {
                    tail.next = temp1;
                    tail = tail.next;
                    temp1 = temp1.next;
                }
            } else {
                if(head == null){
                    head = temp2;
                    tail = temp2;
                    temp2 = temp2.next;
                } else {
                    tail.next = temp2;
                    tail = tail.next;
                    temp2 = temp2.next;
                }
            }
        }
        while(temp1 != null){
            if(head == null){
                head = temp1;
                tail = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp1;
                tail = tail.next;
                temp1 = temp1.next;
            }
        }

        while(temp2 != null){
            if(head == null){
                head = temp2;
                tail = temp2;
                temp2 = temp2.next;
            } else {
                tail.next = temp2;
                tail = tail.next;
                temp2 = temp2.next;
            }
        }
        return head;
    }
}
