import org.w3c.dom.NamedNodeMap;

import java.awt.desktop.AppReopenedEvent;

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

public class CircularLinkedList {
    Node head;
    Node tail = null;

    public void addData(int newData){
        Node newNode = new Node(newData);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        System.out.println("Added " + newData + " to the List");
    }

    public void displayInfo(){
        Node current = head;
        if(head == null) return;
        System.out.print("Nodes: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("Back to head.");
    }

    public void reverseDisplay(){

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node current = tail;
        System.out.print("Reverse Nodes: ");
        do{
            System.out.print("[" + current.data + "] -> ");
            current = current.prev;
        } while (current != tail);
        System.out.println("Back to tail");

    }

    public boolean search(int target){
        if (head == null){
            System.out.println("List is empty to search.");
            return false;
        }
        Node current = head;

        do{
            if (current.data == target){
                System.out.println("Found target: " + target);
                return true;
            }
            current = current.next;
        } while (current != head);
        System.out.println("Target can't be found.");
        return false;
    }

    public void reverseList(){
        if (head == null) return;
        Node current = head;
        Node temp = null;

        do {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;
        } while (current != head);

        temp = head;
        head = tail;
        tail = temp;

        System.out.println("Reversed the List.");
    }

}
