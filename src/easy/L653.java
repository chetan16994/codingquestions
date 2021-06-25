package easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class L653 {
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
    int sum=0;
    public Boolean inOrder(TreeNode root, int k){
        if (root!=null) {
            if((root.val+root.left.val)>k)
                inOrder(root.left, k);
            inOrder(root.right, k);
        }
        return false;
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

    Set<Integer> set = new HashSet<Integer>();

    public boolean findTarget(TreeNode root, int k) {
        if (root==null)
            return false;

        if (set.contains(k- root.val)) return true;
        set.add(root.val);

        return findTarget(root.left,k) || findTarget(root.right,k);
    }
    public static void main(String[] args) {
        L653 obj=new L653();
        TreeNode root=insert(null,5);
        insert(root,3);
        insert(root,6);
        insert(root,2);
        insert(root,4);
        insert(root,7);
        BFS(root);
        System.out.println(obj.findTarget(root,9));
    }
}
