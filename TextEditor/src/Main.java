//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();

		editor.type("Hello World");
		editor.backspace(5);
		editor.type("Java");
		System.out.println("Current Screen: " + editor.display());

	}
}
