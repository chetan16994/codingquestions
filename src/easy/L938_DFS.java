package easy;

import java.util.LinkedList;
import java.util.Queue;

public class L938_DFS {
    public  class TreeNode{
        int val;
       TreeNode left;
       TreeNode right;
        TreeNode(int data){
            this.val =data;
            left=right=null;
        }
    }

    public TreeNode insert(TreeNode node, int data){
        if (node==null)
            return new TreeNode(data);
        if (data< node.val)
            node.left=insert(node.left,data);
        else if (data> node.val)
            node.right=insert(node.right,data);

        return node;
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;

        if(root.val<low) return rangeSumBST(root.right,low,high);

        if(root.val>=low && root.val<=high)
            return rangeSumBST(root.left,low,high)+root.val+rangeSumBST(root.right,low,high);

        if(root.val>high) return rangeSumBST(root.left,low,high);
            return 0;
    }

    public void inorder(L938_BFS.TreeNode node){
        if (node!=null) {
            inorder(node.left);
            System.out.println(node.val);
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        L938_DFS obj=new L938_DFS();
        TreeNode root=obj.insert(null,10);
        obj.insert(root,5);
        obj.insert(root,15);
        obj.insert(root,3);
        obj.insert(root,7);
        obj.insert(root,18);
        System.out.println(obj.rangeSumBST(root,7,15));
    }

}
