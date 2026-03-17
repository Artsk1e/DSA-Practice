//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtFront(3);
        list.insertAtEnd(4);
        list.insertAtFront(2);
        list.insertAtEnd(5);
        list.insertAtFront(1);

        list.displayInfo();
		}
	}

