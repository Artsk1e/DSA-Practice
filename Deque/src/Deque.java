public class Deque {
    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node front;
    private Node rear;
    private int count;

    public void addAtFront(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
            System.out.println("Added " + data + " to the list");
            return;
        }
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
        System.out.println("Added " + data + " to the front");
        count++;
    }

    public void addAtEnd(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            System.out.println("Added " + data + " to the list");
            return;
        }
        newNode.prev = rear;
        rear.next = newNode;
        rear = newNode;
        System.out.println("Added " + data + " to the rear");
        count--;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void showDisplay(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("\n---CURRENT LIST---\n");
        Node current = front;
        while(current != null){
            System.out.print("[" + current.data + "] -> ");
            current = current.next;
        }
        System.out.println("null");

    }

}
