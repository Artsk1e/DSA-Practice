//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        Browser_History history = new Browser_History("github.com");
        history.visit("Youtube.com");
        history.visit("Facebook.com");
        history.visit("Tiktok.com");

        System.out.println("\n--- Testing Navigation ---");

        history.back();
        history.back();
        history.forward();

        System.out.println("\n--- Testing Branching ---");
        history.visit("instagram.com");
        history.forward();

        history.printFullHistory();
	}
}
