import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
//  * Учитывая двоичного дерева, верните порядок обхода значений его узлов.

//  * пример * 
//  * Input: root = [1,null,2,3]
//  * Output: [1,2,3]
//  * 
//  *     public class TreeNode {
//  *        int val;
//  *        TreeNode left;
//  *        TreeNode right;
//  *        TreeNode() {}
//  *        TreeNode(int val) { this.val = val; }
//  *        TreeNode(int val, TreeNode left, TreeNode right) {
//  *        this.val = val;
//  *        this.left = left;
//  *        this.right = right;
//  *        }
//  *     }
//  * 
//  *     public List<Integer> preorderTraversal(TreeNode root) {
//  *     }
//  * 
//  */

public class homeworkByLesson6 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(null), 
                               new TreeNode(2, new TreeNode(),  
                                        new TreeNode(3)));

        System.out.println(TreeNode.preorderTraversal(root));
    }
} 


class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right; 
    
    TreeNode( ){
    }
    TreeNode(Integer val){
        this.val = val;
    }
    
    TreeNode (int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
        
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val != null) result.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    } 
           
}
