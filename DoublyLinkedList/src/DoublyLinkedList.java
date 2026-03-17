import javax.print.attribute.standard.MediaSize;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList {
    Node head;

    public void insertAtFront(int newData){
        Node newNode = new Node(newData);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtEnd(int newData){

        Node newNode = new Node(newData);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void displayInfo(){
        Node current = head;
        while (current != null){
            System.out.print("["+ current.data+ "] <-> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
