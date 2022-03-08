package com.ninjas.world.linkedlist;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class LinkedList {
    public static Node takeInput(){
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        Node head = null,tail = null;
        while(data != -1){
            Node node = new Node(data);
            if(null == head){
                head = node;
                tail = node;
            } else{
                tail.next = node;
                tail = tail.next;
            }
            data = scanner.nextInt();
        }
        return head;
    }
    public static void printLinkedList(Node head){
        if(null == head) {
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        printLinkedList(head.next);
    }
    public static int getLength(Node head){
        if(null == head) return 0;
        return 1+ getLength(head.next);
    }

    public static Node reverseLinkedList(Node head){
        if(null == head || null == head.next ) return head;
        Node recursiveAns = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return recursiveAns;
    }
    public static int getAtIndex(Node head, int index){
        if(index < 0 || null == head) return -1;
        if(index == 0) {
            return head.data;
        }
        return getAtIndex(head.next, index - 1);
    }
    public static void main(String[] args) {
        Node head = takeInput();
        printLinkedList(head);
        System.out.println(getLength(head));
        System.out.println(getAtIndex(head,3));
        Node reversedHead = reverseLinkedList(head);
        printLinkedList(reversedHead);
    }
}
/*
1 -> 2 -> 3 -> 4
1, 2 3 4
4-.3->2->1
 */