package com.ninjas.world.linkedlist.singly;

import com.ninjas.world.linkedlist.singly.LinkedList;
import com.ninjas.world.linkedlist.singly.Node;

/**
 * @author Sonu Kumar
 */
public class DetectLoop {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        System.out.println(detectLoop(head));
    }
    static boolean detectLoop(Node head){
        Node slow = head, fast = head;
        while(null != slow && null != fast && null != fast.next){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
