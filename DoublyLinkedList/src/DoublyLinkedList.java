

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

public class DoublyLinkedList{
    Node head;

    public void insertAtFront(int newData){
        Node newNode = new Node(newData);

        if (head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        System.out.println("Added " +  newData  + " to the front");
    }

    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        if (head == null){
            head = newNode;
            System.out.println("Added " + newData + " to the list");
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        System.out.println("Added " + newData + " to the end");
    }

    public void displayInfo(){
        Node current = head;
        System.out.println("Current LinkedList: ");
        while (current != null){
            System.out.print("[" + current.data + "] <-> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void reverseDisplay(){
        Node current = head;
        System.out.println("Reverse LinkedList: ");
        if (head == null) {return;}

        while (current.next != null){
            current = current.next;
        }

        while (current != null){
            System.out.print("[" + current.data + "] <-> ");
            current = current.prev;
        }
        System.out.print("null");
    }
}