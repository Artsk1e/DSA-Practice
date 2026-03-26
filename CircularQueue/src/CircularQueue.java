import org.w3c.dom.Node;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public CircularQueue(int size){
        this.capacity = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full! Cannot add " + data);
            return;
        }
        rear = (rear + 1)%capacity;
        arr[rear] = data;
        count++;
        System.out.println("Added " + data + " at index " + rear);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty. Cannot Dequeue.");
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        count++;
        return value;
    }

    public boolean isFull(){
        return count == capacity;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Nothing to show.");
            return;
        }
        int tempFront = front;
        for (int i = 0; i <count; i++){
            System.out.print("[" + arr[tempFront] + "] ");
            tempFront = (tempFront+1) %capacity;
        }
        System.out.println();
    }
}
