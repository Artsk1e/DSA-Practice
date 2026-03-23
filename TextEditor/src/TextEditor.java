import java.awt.desktop.SystemSleepEvent;
import java.util.Stack;
public class TextEditor {
    private Stack<Character> history;

    public TextEditor(){
        history = new Stack<>();
    }

    public void type(String text){
        for (char c: text.toCharArray()){
            history.push(c);
        }
        System.out.println("Typed: " + text);
    }

    public void backspace(int steps){
        System.out.println("Hitting Backspace " + steps + " times...");
        for (int i = 0; i < steps; i++) {
            if(!history.isEmpty()) {
                history.pop();
            }
        }
    }

    public String display(){
        StringBuilder  sb = new StringBuilder();
        for(Character c : history){
            sb.append(c);
        }
        return sb.toString();
    }
}
