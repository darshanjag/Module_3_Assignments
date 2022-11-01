package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Sum_of_all_nodes_Binary_tree {
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
        Solution tree = new Solution();
        int result=tree.addBT(root);
        System.out.print(result);
    }
}



class Solution{
    public int addBT(Node temp){
        int sum =0, sumRight=0, sumLeft=0;
        if(temp==null){
            return 0;
        }else{
            //Calculate the sum of nodes present in left subtree
            if(temp.left != null)
                sumLeft = addBT(temp.left);

            //Calculate the sum of nodes present in right subtree
            if(temp.right != null)
                sumRight = addBT(temp.right);

            //Calculate the sum of all nodes by adding sumLeft, sumRight and root node's data
            sum = temp.data + sumLeft + sumRight;
            return sum;
        }

    }
}
