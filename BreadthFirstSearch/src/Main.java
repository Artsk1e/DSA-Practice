public class Main {
    public static void main(String[] args) {
        BFS tree = new BFS();

        tree.insert(10);
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        tree.runLevelOrder();
    }
}
