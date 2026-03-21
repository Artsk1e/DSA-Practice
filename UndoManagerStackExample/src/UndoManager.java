

public class UndoManager {
    private SimpleStack undoStack = new SimpleStack();
    private SimpleStack redoStack = new SimpleStack();
    private String currentText = "";

    public void typee(String newText) {
        System.out.println("Typing: " + newText);
        undoStack.push(newText);

        while (!redoStack.isEmpty()) {
            redoStack.pop();
        }
        currentText = newText;
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }
        String action = undoStack.pop();
        redoStack.push(action);

        System.out.println("Undid: " + action);
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }
        String action = redoStack.pop();
        undoStack.push(action);

        System.out.println("Redo: " + action);
    }

    public void display(){

        System.out.println("EDITOR HISTORY");

        System.out.println("Current Top :" + (undoStack.isEmpty() ? "none" : undoStack.peek()));
        System.out.println("UNDO HISTORY:");
        undoStack.displayText();
        System.out.println("---------------");
        System.out.println("REDO HISTORY");
        if (redoStack.isEmpty()){
            System.out.println("No redo available");
        } else{
            redoStack.displayText();
        }

        System.out.println("============");
    }

}

