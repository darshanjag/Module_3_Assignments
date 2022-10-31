package Trees;
import java.util.*;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

class Preorder_Traversal_problem{
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack <TreeNode> stack = new Stack<>();
        List <Integer> list = new ArrayList();
//        while(!stack.isEmpty()|| root!=null){
//            while(root!=null){
//                list.add(root.val);
//                stack.push(root);
//                root=root.left;
//            }
//            root = stack.pop();
//            root = root.right;
//        }
        return list;
    }
    public static void main(String [] args){

    }
}