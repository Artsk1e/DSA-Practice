//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(1);
        list.insertAtEnd(6);

        list.displayInfo();
        list.reverse();
        list.displayInfo();
		}
	}

