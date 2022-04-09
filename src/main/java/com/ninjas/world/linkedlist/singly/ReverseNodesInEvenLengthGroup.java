package com.ninjas.world.linkedlist.singly;

/**
 * @author Sonu Kumar
 */
public class ReverseNodesInEvenLengthGroup {

    public static void main(String[] args) {
        Node head = LinkedList.takeInput();
        LinkedList.printLinkedList(reverseInEvenGroup(head));
    }
//[5,2,6,3,9,1,7,3,8,4]
    private static Node reverseInEvenGroup(Node head) {
        if(head.next == null) return head;
        int count  = 1;
        Node temp = head, prev = null;
        int groupCount = 1;
        Node lastFinish = null;
        while(temp != null ){
            groupCount = count;
            if(groupCount % 2 == 0){
                Node temPrev = temp;
                int j = 1;
                Node lastPrev = temp;
                while(j < groupCount && null != temp ){
                    temp = temp.next;
                    j++;
                }
                // in case of even length in the last group
                if((j-1)%2 == 0  && temp == null){
                    lastFinish.next =  LinkedList.reverseLinkedList(lastPrev);
                    lastPrev.next=null;
                    return head;
                } else if((j)%2 == 0  && temp == null){  // in case of odd length in the last group
                    return head;
                }
                Node newTemp = temp.next;
                temp.next = null;

                Node revHead = LinkedList.reverseLinkedList(temPrev);
                lastFinish.next = revHead;
                temPrev.next = newTemp;
                lastFinish = temPrev;
                temp = newTemp;
                System.out.print("sofar updated :: ");
                LinkedList.printLinkedList(head);
            }
            else {
                int j = 1;
                while(j <= groupCount && null != temp ){
                    prev = temp;
                    if(j == groupCount || groupCount == 1){
                        lastFinish = temp;
                    }
                    temp = temp.next;
                    j++;
                }
                // in case of even length in the last group
                if((j-1)%2 == 0  && temp == null){
                    Node rev =   LinkedList.reverseLinkedList(lastFinish.next);
                    lastFinish.next = rev;
                    return head;
                }
            }
            if(temp == null || temp.next == null) return head;
            count++;
        }
        return head;
    }

}
