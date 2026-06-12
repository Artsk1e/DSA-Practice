public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        System.out.println("----BINARY SEARCH TREE----");

        tree.insert(30);
        tree.insert(20);
        tree.insert(50);
        tree.insert(40);
        tree.insert(70);
        tree.insert(10);
        tree.insert(60);
        tree.printInOrder();

        System.out.println("\n----Testing The Search Engine----");

        int target1 = 30;
        boolean found1 = tree.search(target1);
        System.out.println("Searching for " + target1 + "... Found? " + found1);
        
        int target2 = 99;
        boolean found2 = tree.search(target2);
        System.out.println("Searching for " + target2 + "...Found? " + found2);
    }
}
