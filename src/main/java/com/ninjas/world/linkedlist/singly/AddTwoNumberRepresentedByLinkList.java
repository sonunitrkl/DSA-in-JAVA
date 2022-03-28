package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class AddTwoNumberRepresentedByLinkList {
    public static void main(String[] args) {
        Node head1 = LinkedList.takeInput();
        Node head2 = LinkedList.takeInput();
        Node ans = addTwoLinkedList(head1, head2);
        LinkedList.printLinkedList(ans);
    }

    static Node addTwoLinkedList(Node head1, Node head2) {
        Node revHead1 = LinkedList.reverseLinkedList(head1);
        Node revHead2 = LinkedList.reverseLinkedList(head2);
        int carry = 0;
        Node temp1=revHead1, temp2 = revHead2;
        Node head = null,tail = null;
       while (null != temp1 && null != temp2){
           int dataToBeAdded = temp1.data + temp2.data + carry;
           carry = dataToBeAdded >= 10 ? 1 : 0;
           if(head == null ){
               Node newNode = new Node(dataToBeAdded >= 10 ? dataToBeAdded % 10 : dataToBeAdded);
               head = newNode;
               tail = newNode;
           } else {
               tail.next = new Node(dataToBeAdded >= 10 ? dataToBeAdded %10 : dataToBeAdded);
               tail = tail.next;
           }
           temp1 = temp1.next;
           temp2 = temp2.next;
       }
       while (temp1 != null){
           int dataToBeAdded = temp1.data + carry;
           carry = dataToBeAdded >= 10 ? 1 : 0;
           tail.next= new Node(dataToBeAdded >= 10 ? dataToBeAdded %10 : dataToBeAdded);
           temp1 = temp1.next;
           tail = tail.next;
       }
        while (temp2 != null){
            int dataToBeAdded = temp2.data + carry;
            carry = dataToBeAdded >= 10 ? 1 : 0;
            tail.next = new Node(dataToBeAdded >= 10 ? dataToBeAdded %10 : dataToBeAdded);
            temp2 = temp2.next;
            tail = tail.next;
        }
        Node ans = LinkedList.reverseLinkedList(head);
        if( carry != 0) {
            Node carryNode = new Node(carry);
            carryNode.next = ans;
            return carryNode;
        }
        return ans;
    }
}
