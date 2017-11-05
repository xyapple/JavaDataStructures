package Recursion;

import java.util.*;

class LinkedListReverser {
    /**
     * Reverses a linked list
     *
     * @param head the linked list to reverse
     * @return head of the reverse linked list
     */


    private Node reverseLinkedList(Node head) {
        
        //list is empty 0
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node newHead = reverseLinkedList(head.getNext());
        
        //list only has 1 element
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }
    
    public static void main(String[] args) {
        //create a linked list
        LinkedListCreator creator = new LinkedListCreator();
        //reverse a linked list
        LinkedListReverser reverser = new LinkedListReverser();

        //create a empty list
        Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList((new ArrayList<>()))));
        //create a list has 1 element
        Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList(Arrays.asList(1))));
        //create a list has a few elements
        Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
        
        
    }
}
