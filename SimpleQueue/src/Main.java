//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {

        SimpleQueue queue = new SimpleQueue();

        queue.isEmpty();
        queue.showQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.showQueue();
        queue.dequeue();
        queue.peek();
        queue.showQueue();
	}
}
