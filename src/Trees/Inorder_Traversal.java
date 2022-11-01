package Trees;
import java.util.*;




public class Inorder_Traversal{
    public static void preorder(Node root){
        if(root==null){
            return;
        }

        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);
    }
    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            root = a.insert(root,sc.nextInt());
        }


        preorder(root);

    }

}