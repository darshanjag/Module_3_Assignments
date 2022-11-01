package Trees;
import java.util.*;


class BST {
    public Node insert(Node root, int data){
        if(root==null){
            return createNewNode(root,data);
        }
        if(data<root.data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }
    public Node createNewNode(Node root, int data){
        Node newNode = new Node(data);
        return newNode;
    }

}

public class Preorder_Traversal_problem{
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
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