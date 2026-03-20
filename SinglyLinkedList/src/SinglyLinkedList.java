class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    public void insertAtFront(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next =newNode;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
        System.out.println("Reversed the Linked list.");
    }

    public void displayInfo(){
        Node current = head;
        while (current != null){
            System.out.print("[" + current.data + "] ->");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean search(int target){
        Node current = head;
        while (current != null){
            if(current.data == target){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
