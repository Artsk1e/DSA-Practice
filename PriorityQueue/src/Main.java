//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue(5);
		queue.display();
		queue.enqueue(50);
		queue.enqueue(40);
		queue.enqueue(30);
		queue.enqueue(20);
		queue.enqueue(60);
		queue.display();
	}
}
