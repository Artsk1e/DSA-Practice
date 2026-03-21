//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.addData(1);
        list.addData(2);
        list.addData(3);
        list.addData(4);

        list.displayInfo();
        list.search(2);
        list.search(5);
        list.reverseDisplay();
        list.reverseList();
        list.displayInfo();
	}
}
