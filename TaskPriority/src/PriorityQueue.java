public class PriorityQueue {
    private int maxSize;
    private int[] queueArray;
    private int nItems;

    public PriorityQueue(int size){
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.nItems = 0;
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }
    public void enqueue(int taskPriority){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        if(isEmpty()){
            queueArray[nItems++] = taskPriority;
        } else {
            int i;
            for(i = nItems-1; i >= 0; i--){
                if(taskPriority > queueArray[i]){
                    queueArray[i+1] = queueArray[i];
                } else {
                    break;
                }
            } queueArray[i+1] = taskPriority;
            nItems++;
        }
    }

    public int dequeue(){
        if(isEmpty()) return -1;
        return queueArray[--nItems];
    }
}
