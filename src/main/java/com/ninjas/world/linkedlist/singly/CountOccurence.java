package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class CountOccurence {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        System.out.println(getCount(head, 4));
    }

    static int getCount(Node head, int search_for){
        int count = 0;
        while(head != null){
            if(head.data == search_for) {
                count++;
            }
            head = head.next;
        }
        return count;
    }
}
