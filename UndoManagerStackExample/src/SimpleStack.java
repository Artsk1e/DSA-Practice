class TextAction{
    String context;
    TextAction next;

    public TextAction(String context){
        this.context = context;
    }
}


public class SimpleStack {
    TextAction top = null;

    public void push(String text) {
        TextAction newNode = new TextAction(text);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (top == null) return null;
        String val = top.context;
        top = top.next;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String peek() {
        if (top == null) return null;
        return top.context;
    }

    public void displayText() {
        if (top == null) {
            System.out.println("Text is Empty.");
            return;
        }
        TextAction temp = top;

        while (temp != null) {
            System.out.println(temp.context + " ");
            temp = temp.next;

        }
        System.out.println("\n------------------------");
    }
}
