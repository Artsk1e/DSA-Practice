import java.security.PublicKey;

public class PriorityQueue {
    private int maxSize;
    private int[] queueArray;
    private int nItems;

    public PriorityQueue(int size){
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.nItems = 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public boolean isEmpty(){
        return nItems == 0;
    }
    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }

        if(isEmpty()){
            queueArray[nItems++] = item;
        } else {
            int i;
            for(i = nItems-1; i >=0 ; i--){
                if(item > queueArray[i]){
                    queueArray[i+1] = queueArray[i];
                } else{
                    break;
                }
            }
            queueArray[i + 1] = item;
            nItems++;
        }
    }

    public int dequeue(){
        if(isEmpty()) return -1;
        return queueArray[--nItems];
    }
    public int peek(){
        return queueArray[nItems-1];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        } else{
        System.out.print("[ ");
        for(int i = nItems-1; i >= 1; i--) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
        }
    }
}

