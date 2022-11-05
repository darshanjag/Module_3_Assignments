package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//        left=null;
//        right=null;
//    }
//}

//driver code
class Root_Equals_Sum_Of_Children {
    static Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }


    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Node root = buildTree(s);
        Solution1 tree = new Solution1();
        boolean result=tree.checkTree(root);
        System.out.print(result);
    }
}



 class Solution1{
    static int sum =0;
    static int helper(Node root){
        if(root ==null){
            return 0;
        }
        helper(root.left);
        helper(root.right);
        sum+=root.data;

        return sum;
    }
    public boolean checkTree(Node root)
    {
        if(helper(root)-root.data==root.data){
            return true;
        }else{
            return false;
        }


    }
}