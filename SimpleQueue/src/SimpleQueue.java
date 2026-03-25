public class SimpleQueue {
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;
    private int size;

    public SimpleQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + data);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedData = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }
        size--;
        System.out.println("Dequeue: " + removedData);
        return removedData;
    }

    public int peek(){
        if(isEmpty()) return -1;
        return front.data;
    }

    public int getSize(){
        return size;
    }

    public void showQueue(){
        if (isEmpty()){
            System.out.println("No queue to show.");
            return;
        }
        System.out.print("Queue: ");
        Node current = front;
        while(current != null){
            System.out.print("[" + current.data + "] <- ");
            current = current.next;
        }
        System.out.println("Null");

    }
}
