//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        Deque queue = new Deque();

        queue.showDisplay();
        queue.addAtFront(3);
        queue.addAtEnd(4);
        queue.addAtFront(2);
        queue.addAtEnd(5);
        queue.addAtFront(1);
        queue.showDisplay();
	}
}
