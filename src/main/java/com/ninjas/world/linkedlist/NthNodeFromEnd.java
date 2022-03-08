package com.ninjas.world.linkedlist;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class NthNodeFromEnd {
    public static void main(String[] args) {
        Node head  = LinkedList.takeInput();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getNthNodeFromEnd(head,n));
    }

    private static int getNthNodeFromEnd(Node head, int n) {
        if(null == head || LinkedList.getLength(head) > n) return -1;
        Node node1  = head, node2 = head;
        int i = 1;
        while (i < n){
            i++;
            node1 = node1.next;
        }
        while (null != node1.next){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node2.data;
    }
}
