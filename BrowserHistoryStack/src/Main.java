//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();

        history.currentPage();
        history.back();
        history.visit("facebook.com");
        history.visit("youtube.com");
        history.visit("google.com");
        history.back();
        history.currentPage();
	}
}
