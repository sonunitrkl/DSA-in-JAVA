package com.ninjas.world.linkedlist.singly;
// https://www.geeksforgeeks.org/count-rotations-sorted-rotated-linked-list/
/**
 * @author Sonu Kumar
 */
public class CountRotationInSortedRotatedList {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        System.out.println(countRotation(head));
    }
    static int countRotation(Node head){
        int count = 1;
        Node temp = head;
        while(null != temp && null != temp.next && temp.data <= temp.next.data){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
