package Recursion;
import java.util.*;

public class LinkedListCreator {
    /**Create a Linked list.
     *
     * @param data the data to create the list
     * @return head of the linked list. The returned linked list ends
     * with last node with getNext()==null
     *
     * */

    public Node createLinkedList(List<Integer> data){
        if(data.isEmpty()){
            return null;
        }

        //first node is head
        Node firstNode = new Node(data.get(0));

        //create a link from first data to the last one.
        Node headOfSublist =createLinkedList(data.subList(1, data.size()));

        //Point firstNode to the head
        firstNode.setNext(headOfSublist);

        return firstNode;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        //create a empty list
        Node.printLinkedList(creator.createLinkedList(new ArrayList<>()));
        //create a list has 1 element
        Node.printLinkedList(creator.createLinkedList(Arrays.asList(1)));
        //create a list has a few elements
        Node.printLinkedList(creator.createLinkedList(Arrays.asList(1,2,3,4,5)));


    }
}
