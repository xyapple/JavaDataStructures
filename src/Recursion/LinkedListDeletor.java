package Recursion;

import java.util.*;

/*
* [1,2,3,2,3,4,5,2,8] delete 2
* */
public class LinkedListDeletor {
    
    public Node deleteIfEquals(Node head, int value){
        /*if(head == null){
            return null;
        }*/
        /*if(head.getValue() == value){
            head = head.getNext();
        }*/
        while(head != null && head.getValue() == value){
            head = head.getNext();
        }
        if(head == null){
            return null;
        }
        Node prev = head;
        //Loop invariant: list nodes from head up to prev has been processed.
        //Nodes with values equal to value are deleted
        while(prev.getNext() != null){
            if(prev.getNext().getValue() == value){
                prev.setNext(prev.getNext().getNext());
            } else{
                prev = prev.getNext();
            }
        }
        return head;
        
    }
    
    public static void main(String[] args) {
        //create a linked list
        LinkedListCreator creator = new LinkedListCreator();
        //reverse a linked list
        LinkedListDeletor deletor = new LinkedListDeletor();
    
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(1, 2, 3, 2, 5,2)),2));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(1, 2, 3, 2, 2)),2));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(1, 2, 3, 2, 2, 5,7,2)),2));
        //problem statement
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2, 2, 3, 2)),2));
    
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2, 2, 2, 2)),2));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2)),2));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2)),1));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(new ArrayList<>()),1));
    
    
    }
}
