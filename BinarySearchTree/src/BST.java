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


public class BST {
    private TreeNode root;

    public BST(){
        this.root = null;
    }

    public void insert(int data){
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode current, int data){
        if(current == null) {
            return new TreeNode(data);
        }

        if(data < current.data){
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data){
            current.right = insertRecursive(current.right, data);
        }
         return current;
    }

    public boolean search(int target){
        TreeNode current = root;

        while(current != null){
            if (target == current.data){
                return true;
            } else if (target < current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void printInOrder(){
        System.out.println("Sorted Tree Data In-Order: ");
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(TreeNode current) {
        if(current != null){
            inOrderRecursive(current.left);
            System.out.print(current.data + " ");
            inOrderRecursive(current.right);
        }
    }
}
