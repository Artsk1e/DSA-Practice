//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Current Stack");
        stack.display();

        int x = stack.pop();
        System.out.println("\nPopped value (x): " + x);

        System.out.println("Stack after 1 pop");
        stack.display();

	}
}
