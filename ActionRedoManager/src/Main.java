//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        ActionRedoManager manager = new ActionRedoManager();

        manager.undo();
        manager.redo();
        manager.performAction("Typed 'Hello'");
        manager.performAction("Changed color to Red");
        manager.performAction("Deleted Paragraph 2");

        manager.showCurrentState();

        manager.undo();
        manager.undo();

        manager.redo();

        manager.showCurrentState();
	}
}
