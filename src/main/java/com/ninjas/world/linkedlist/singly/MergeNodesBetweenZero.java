package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class MergeNodesBetweenZero {

    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        LinkedList.printLinkedList(mergeNodes(head));
    }

    public static Node mergeNodes(Node head) {
        Node ansHead = null, ansTail = null, temp = head;
        while (temp != null && temp.next != null) {
//            if (temp.data == 0) {
                int sum = 0;
                temp = temp.next;
                while (temp != null) {
                    System.out.println("temp data = "+ temp.data );
                    sum += temp.data;
                    temp = temp.next;
                    if(temp.data ==0){
                        System.out.println("temp data = "+ temp.data + " sum :: " + sum);
                        break;
                    }
                }
                Node node = new Node(sum);
                node.next = null;
                if (ansHead == null) {
                    ansHead = node;
                    ansTail = node;
                } else  {
                    ansTail.next = node;
                    ansTail = ansTail.next;
                }
            }
            temp = null != temp ? temp.next : null;
       // }
        return ansHead;
    }
}
