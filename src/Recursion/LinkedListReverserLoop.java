package Recursion;



import java.util.Arrays;

class LinkedListReverserLoop {
    private Node reverseLinkedList(Node head){
       Node newHead = null;
       Node curHead = head;
        // Loop invariant
        //newHead points to the linked list already reversed.
        // curHead points to the linked list not yet reversed.
        
        while(curHead != null){
            //curHead == null
            //Loop invariant holds
            Node next = curHead.getNext(); //next = null
            curHead.setNext(newHead); //curHead.next reversed
            newHead = curHead; //newHead Points to last node
            curHead = next; //curHead = null
        }
        //Loop invariant holds
        return newHead;
    }
    
    public static void main(String[] args) {
        //create a linked list
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListReverserLoop reverserLoop = new LinkedListReverserLoop();
       Node.printLinkedList(reverserLoop.reverseLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
    
    }
    
    
}
