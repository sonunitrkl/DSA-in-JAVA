package com.ninjas.world.linkedlist.singly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
class Pair{
    Node head;
    Node tail;
}
public class ReverseListInRange {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
       // LinkedList.printLinkedList(reverseList(head, left, right));
        LinkedList.printLinkedList(reverseRange(head,left,right));
    }

    private static Node reverseList(Node head, int left, int right) {
        int count = 1;
        Node temp = head;
        Node tempHead = null;
        Node tempTail = null, prev = null;
        while(temp != null){
            if(left == 1) {
                prev = head;
            }
            if(left != 1 && count == left-1) prev = temp;
            if(count == left) {
                while(temp != null){
                    if(tempHead == null) {
                        tempHead = temp;
                        tempTail = temp;
                    } else{
                        tempTail.next = temp;
                        tempTail = tempTail.next;
                    }
                    if(count == right){
                        System.out.println("count :: " + count);
                        break;
                    }
                    count++;
                    temp = temp.next;
                }
            }
            count++;
            temp = temp.next;
        }
        if(null != prev){
            tempTail.next = null;
            Pair rev = reverse(tempHead);
            System.out.println("temp list :: ");
            LinkedList.printLinkedList(tempHead);
            System.out.println("reversed list :: ");
            LinkedList.printLinkedList(rev.head);
            prev.next = rev.head;
            rev.tail.next = temp;
            return head;
        }
        return head;
    }
    public static Node reverseRange(Node head, int left , int right){
        List<Integer> data = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            data.add(temp.data);
            temp = temp.next;
        }
        int i = left-1, j=right-1;
        while(i<=j){
            int tmp = data.get(i);
            data.set(i,data.get(j));
            data.set(j,tmp);
            i++;
            j--;
        }
        System.out.println(data);
        temp = head;
        int k=0;
        while(temp != null){
            temp.data = data.get(k++);
            temp = temp.next;
        }
        return head;
    }

    private static Pair reverse(Node head) {
        if(head == null || head.next == null) {
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
    }
