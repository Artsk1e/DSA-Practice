public class Main {
    
    public static void main(String[] args) {
        DFS tree = new DFS();

        tree.insert(10);
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        System.out.println("--- PRE-ORDER (Root -> Left -> Right) ---");
        tree.runPreOrder(tree.getRoot());
        System.out.println("\n");

        System.out.println("--- IN-ORDER (Left -> Root -> Right) ---");
        tree.runInOrder(tree.getRoot());
        System.out.println("\n");

        System.out.println("--- POST-ORDER (Left -> Right -> Root) ---");
        tree.runPostOrder(tree.getRoot());
        System.out.println("\n");
    }
}
