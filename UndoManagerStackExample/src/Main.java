//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
		UndoManager notes = new UndoManager();
		notes.typee("John");
		notes.typee("is");
		notes.typee("Good");
		notes.typee("Man");

		notes.undo();
		notes.undo();
		notes.display();


	}
}
