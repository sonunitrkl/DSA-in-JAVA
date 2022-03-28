package com.ninjas.world.linkedlist.singly;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class ReverseLinkedListInGroupK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Node head = LinkedList.takeInput();
        LinkedList.printLinkedList(reversekList(head,k));
    }

    private static Node reversekList(Node head, int k) {
        return null;
    }
}
