package com.ninjas.world.linkedlist.singly;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class KReverseList {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        LinkedList.printLinkedList(kReverse(head,length(head), k).head);
    }

    private static Pair reverse(Node head) {
        if (head == null || head.next == null) {
            Pair pair = new Pair();
            pair.head = head;
            pair.tail = head;
            return pair;
        }
        Pair recAns = reverse(head.next);
        recAns.tail.next = head;
        head.next = null;
        Pair ans = new Pair();
        ans.tail = head;
        ans.head = recAns.head;
        return ans;
    }
    private static int length(Node head){
        if(head == null) return 0;
        return 1+length(head.next);
    }
    private static Pair kReverse(Node head,int length, int k) {
        if (head == null || head.next == null){
            Pair ans = new Pair();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        if(length < k ){
            return reverse(head);
        }
        Node temp = head;
        int count = 1;
        while (count < k ) {
            temp = temp.next;
            count++;
        }
        Node next = temp.next;
        temp.next = null;
        Pair ourCalc = reverse(head);
        ourCalc.tail.next = kReverse(next,length-k, k).head;
        return ourCalc;
    }

    static class pair {
        Node head;
        Node tail;
    }
}
