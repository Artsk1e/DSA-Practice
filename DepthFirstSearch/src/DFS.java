class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class DFS {
    private TreeNode root;

    public DFS(){
        this.root = null;
    }

    public void insert(int data){
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode current, int data) {
        if (current == null){
            return new TreeNode(data);
        }
        if(data < current.data){
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data){
            current.right = insertRecursive(current.right, data);
        }
        return current;
    }

    public void runPreOrder(TreeNode node){
        if (node == null) return;

        System.out.print(node.data + " ");
        runPreOrder(node.left);
        runPreOrder(node.right);
    }

    public void runInOrder(TreeNode node){
        if (node == null) return;

        runInOrder(node.left);
        System.out.print(node.data + " ");
        runInOrder(node.right);
    }

    
    public void runPostOrder(TreeNode node){
        if (node == null) return;

        runPostOrder(node.left);
        runPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    public TreeNode getRoot(){
        return this.root;
    }
}
