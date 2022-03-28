package com.ninjas.world.linkedlist.singly;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sonu Kumar
 */
public class RemoveConsecutiveNodeSumToZero {
    static class Pair{
        Node prev;
        Node curr;
    }
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        LinkedList.printLinkedList(remove(head));
    }

    private static Node remove(Node head) {
        if(head.data == 0) return null;
        Map<Integer, Node> mp = new HashMap<>();
        int sum =0;
        Node curr = head;
        while(curr != null){
            sum  +=curr.data;
            if(mp.containsKey(sum)){
                Node lastSeen = mp.get(sum);
                lastSeen.next = curr.next;
                mp.remove(sum);
                curr = curr.next;
            }
            mp.put(sum,curr);
            curr = curr.next;
        }
        return head;
    }
}
