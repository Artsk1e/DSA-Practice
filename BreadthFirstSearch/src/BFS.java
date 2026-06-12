import java.util.LinkedList;
import java.util.Queue;

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

public class BFS {
    private TreeNode root;

    public BFS(){
        this.root = null;
    }

    public void insert(int data){
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode current, int data) {
        if (current == null) return new TreeNode(data);
    
        if (data < current.data){
        current.left = insertRecursive(current.left, data);
        } else if (data > current.data){
        current.right = insertRecursive(current.right, data);
        }
    return current;
    }
    
    public void runLevelOrder(){
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        System.out.print("BFS (Level Order) Output; ");
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if(current.left != null){
                queue.add(current.left);
            }

            if(current.right != null){
                queue.add(current.right);
            }
        }
        System.out.println();
    }
}