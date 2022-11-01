import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    static int idx =-1;
    public static Node buildTree(int [] nodes){
        if(idx<6){
            idx++;
        }

        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }

}

class Solution {
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void preBST(int arr[], int n)
    {


        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(arr);
        preorder(root);



    }
}

public class Preorder_Traversal_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.preBST(array,n);
    }
}