import java.awt.desktop.SystemEventListener;
import java.util.Stack;

public class ActionRedoManager {
    private Stack<String> actionStack;
    private Stack<String> redoStack;

    public ActionRedoManager(){
        actionStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void performAction(String action){
        actionStack.push(action);
        redoStack.clear();
        System.out.println("Action: " + action);
    }

    public void undo(){
        if(!actionStack.isEmpty()){
            String lastAction = actionStack.pop();
            redoStack.push(lastAction);
            System.out.println("Undo: " + lastAction);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo(){
        if(!redoStack.isEmpty()){
            String lastAction = redoStack.pop();
            actionStack.push(lastAction);
            System.out.println("Redo: " + lastAction);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public void showCurrentState(){
        System.out.println("Current History: " + actionStack);
    }
}
