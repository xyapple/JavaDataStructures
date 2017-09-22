package Loop;

public class Node {
    //
    private final int value;
    //
    private Recursion.Node next;
    
    //construtor
    public Node(int value){
        this.value = value;
        this.next = null;
    }
    //can not change the value;
    public int getValue(){
        return value;
    }
    public Recursion.Node getNext(){
        return next;
    }
    public void setNext(Recursion.Node next){
        this.next = next;
    }
    
    public static void printLinkedList (Recursion.Node head){
        while(head != null){
            System.out.print(head.getValue());
            System.out.print(" ");
            head = head.getNext();
        }
        
        System.out.println();
        
    }
    
}

