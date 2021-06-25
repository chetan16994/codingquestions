package easy;

import java.util.LinkedList;
import java.util.Queue;

public class L700 {
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
    public static void BFS(TreeNode root){
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
    static LinkedList<Integer> li=new LinkedList<Integer>();
    int mainRoot=4;

    public void inorder(TreeNode root){
        if (root!=null){
            System.out.println(root.val);
            if (root.val==mainRoot)
                System.out.println("end");
            inorder(root.left);

            inorder(root.right);
        }    }
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null)
            return root;
        if (val==root.val)
            return root;
        if (val>root.val)
            return searchBST(root.right,val);
        return searchBST(root.left,val);
    }
    public static void main(String[] args) {
        L700 obj=new L700();
        TreeNode root=insert(null,4);
        insert(root,2);
        insert(root,7);
        insert(root,1);
        insert(root,3);

        obj.inorder(root);
    }
}
