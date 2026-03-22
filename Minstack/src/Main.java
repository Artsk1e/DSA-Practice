//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        Minstack ms = new Minstack();
        ms.push(-2);
        ms.push(0);
        ms.push(1);
        System.out.println("Min is: " + ms.getMin());
        ms.pop();
        System.out.println("Top is: " + ms.top());
        System.out.println("Min is: " + ms.getMin());
	}
}
