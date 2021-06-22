package easy;

import java.util.LinkedList;
import java.util.Queue;

public class L617 {
    public class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }

    public TreeNode insert(TreeNode node, int val){
        if (node==null)
            return new TreeNode(val);

        if (node.val>val)
            node.left=insert(node.left,val);
        else if (node.val<val)
            node.right=insert(node.right,val);

        return node;
    }

    public void inorder(TreeNode root){
        if (root!=null) {
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null)return root2;
        if (root2==null)return root1;

        root1.val=root1.val+ root2.val;
        root1.left=mergeTrees(root1.left,root2.left);
        root1.right=mergeTrees(root1.right,root2.right);

        return root1;

    }
    public void BFS(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode tempNode = q.poll();
            System.out.println(tempNode.val);

            if (tempNode.left != null)
                q.add(tempNode.left);
            if (tempNode.right != null)
                q.add(tempNode.right);
        }
    }
    public static void main(String[] args) {
        L617 obj=new L617();
        TreeNode root1= obj.insert(null,1);
        obj.insert(root1,5);
        obj.insert(root1,3);
        obj.insert(root1,2);
        obj.insert(root1,7);

        TreeNode root2= obj.insert(null, 8);
        obj.insert(root2,9);
        obj.insert(root2,11);
        obj.insert(root2,14);
        obj.insert(root2,15);
        obj.insert(root2,20);

        obj.BFS(root1);
        System.out.println("--");
        obj.BFS(root2);
        System.out.println("---");

        TreeNode root3=obj.mergeTrees(root1,root2);
        obj.BFS(root3);
    }
}
