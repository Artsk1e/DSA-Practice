class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

public class SimpleStack {
    Node top = null;
    int stackSize=0;

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        return stackSize;
    }

    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        stackSize++;
    }

    public int pop(){
        if (top == null){
            return -1;
        }
        int value = top.data;
        top = top.next;
        stackSize--;
        return value;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    public void display(){
        if (top == null){
            System.out.println("Stack is empty");
            return;
        }

        Node current = top;
        System.out.print("TOP -> ");
        while (current != null){
            System.out.print("[" + current.data + "] ");
            current = current.next;
        }
        System.out.println("-> BOTTOM");
    }


    public void reverseStack(){
        if(isEmpty()) return;
        SimpleStack tempstack1 = new SimpleStack();
        SimpleStack tempstack2 = new SimpleStack();

        while(!this.isEmpty()){
            tempstack1.push(this.pop());
        }
        while(!tempstack1.isEmpty()){
            tempstack2.push(tempstack1.pop());
        }

        while (!tempstack2.isEmpty()){
            this.push(tempstack2.pop());
        }

    }
}
