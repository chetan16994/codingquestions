package easy;

import java.util.LinkedList;
import java.util.Queue;

public class L226 {
    public static class TreeNode {
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
    public static TreeNode insert(TreeNode node, int val){
        if (node==null)
            return new TreeNode(val);

        if (node.val>val)
            node.left=insert(node.left,val);
        else if (node.val<val)
            node.right=insert(node.right,val);

        return node;
    }
    public void BFS(TreeNode root){
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);

        while (!q.isEmpty()){

            TreeNode tempNode=q.poll();
            System.out.println(tempNode.val);

            if (tempNode.left!=null)
                q.add(tempNode.left);
            if (tempNode.right!=null)
                q.add(tempNode.right);
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    public static void main(String[] args) {
        L226 obj=new L226();
        TreeNode root=insert(null,4);
        insert(root,2);
        insert(root,7);
        insert(root,1);
        insert(root,3);
        insert(root,6);
        insert(root,9);

        obj.BFS(root);
        obj.invertTree(root);
        obj.BFS(root);
    }

}
