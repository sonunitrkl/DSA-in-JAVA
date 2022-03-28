package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class AddOneToANumber {
    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        Node head1 = addOnelist(head);
        LinkedList.printLinkedList(head1);
    }
//............................................optimized approach............
    static int addWithCarry(Node head){
        // If linked list is empty, then
        // return carry
        if (head == null)
            return 1;

        // Add carry returned be next node call
        int res = head.data + addWithCarry(head.next);

        // Update data and return new carry
        head.data = (res) % 10;
        return (res) / 10;
    }

    // This function mainly uses addWithCarry().
    static Node addOneList(Node head) {
        // Add 1 to linked list from end to beginning
        int carry = addWithCarry(head);
        // If there is carry after processing all nodes,
        // then we need to add a new node to linked list
        if (carry > 0) {
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode; // New node becomes head now
        }

        return head;
    }
//...........................................................................................
    public static Node reverse(Node head){

        if(head == null || head.next == null){
            return head;
        }
        Node recAns = reverse(head.next);
        head.next.next = head;
        head.next=null;
        return recAns;
    }
    public static Node addOnelist(Node head)
    {
        //code here.
        Node reverseListHead = reverse(head);
        Node temp = reverseListHead;
        int carry = 1;
        while(temp != null){
            int valueToBeAdded = temp.data + carry;
            carry = valueToBeAdded >= 10 ? 1 : 0;
            temp.data = valueToBeAdded>=10 ? valueToBeAdded % 10 : valueToBeAdded;
            temp = temp.next;
        }
        Node ans =  reverse(reverseListHead);
        if(carry != 0){
            Node newnode = new Node(carry);
            newnode.next = ans;
            return newnode;
        }
        return ans;
    }
}
