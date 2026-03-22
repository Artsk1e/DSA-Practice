
public class Browser_History {
    class Node {
        String url;
        Node next, prev;

        public Node(String url){
            this.url = url;
        }
    }
    int historyCount = 0;
    Node current;

    public Browser_History(String homepage){
        this.current = new Node(homepage);
        this.historyCount = 1;
    }

    public void visit(String url){
        Node newNode = new Node(url);
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        System.out.println("Visited: " + url);
        historyCount++;
    }

     public String back(){
        if(current.prev != null){
            current = current.prev;
            System.out.println("Going back...");
            System.out.println("Current page: " + current.url);
        } else {
            System.out.println("No previous page! Staying at: " + current.url);
        }
        return current.url;
     }

     public String forward(){
        if(current.next != null){
            current = current.next;
            System.out.println("Going forward: " + current.url);
            System.out.println("Current page: " + current.url);
        } else{
            System.out.println("No forward page! Staying at " + current.url);
        }
        return current.url;
     }

     public void printFullHistory() {
         Node temp = current;
         while (temp.prev != null) {
             temp = temp.prev;
         }
         System.out.println("--- Full History ---");
         while (temp != null) {
             System.out.print(temp.url + (temp == current ? " [Current]" : " ") + " -> ");
             temp = temp.next;
         }
         System.out.println("End");
     }

}
