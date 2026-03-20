class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

public class SimpleStack {
    Node top = null;

    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if (top == null){
            return -1;
        }
        int value = top.data;
        top = top.next;
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
}
