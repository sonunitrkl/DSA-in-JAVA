package com.ninjas.world.linkedlist.singly;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class PartitionList {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        LinkedList.printLinkedList(partition(head,x));
    }

    private static Node partition(Node head, int x) {
        Node smallerHead = null, smallerTail = null,largerHead = null, largertail = null, xValueNode = null;
        while (head != null){
            if(head.data == x){
                xValueNode = head;
            } else if (head.data < x){
                if(smallerHead == null ){
                    smallerHead = head;
                    smallerTail = head;
                } else {
                    smallerTail.next = head;
                    smallerTail = smallerTail.next;
                }
            } else {
                if(largerHead == null ){
                    largerHead = head;
                    largertail = head;
                } else {
                    largertail.next = head;
                    largertail = largertail.next;
                }
            }
            head = head.next;
        }
        if(null != smallerTail ){
            smallerTail.next = xValueNode;
            xValueNode.next = largerHead;
            largertail.next = null;
            return smallerHead;
        } else {
            xValueNode.next = largerHead;
            largertail.next = null;
            return xValueNode;
        }
    }
}
