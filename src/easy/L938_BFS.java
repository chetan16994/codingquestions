package easy;

import java.util.LinkedList;
import java.util.Queue;

public class L938_BFS {
    public class TreeNode{
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
        int sum=0;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()){

            TreeNode tempNode=q.poll();
            if (tempNode.val <low ) {
                if (tempNode.right != null) q.add(tempNode.right);
            }else if (tempNode.val > high) {
                if (tempNode.left != null) q.add(tempNode.left);
            }else {
                sum+=tempNode.val;
                if (tempNode.right!=null) q.add(tempNode.right);
                if (tempNode.left!=null) q.add(tempNode.left);
            }
        }
        return sum;
    }

    public void inorder(TreeNode node){
        if (node!=null) {
            inorder(node.left);
            System.out.println(node.val);
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        L938_BFS obj=new L938_BFS();
        TreeNode root=obj.insert(null,10);
        obj.insert(root,5);
        obj.insert(root,15);
        obj.insert(root,3);
        obj.insert(root,7);
        obj.insert(root,18);
        System.out.println(obj.rangeSumBST(root,7,15));
    }
}
