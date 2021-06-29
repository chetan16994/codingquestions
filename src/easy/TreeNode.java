package easy;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
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

    public  TreeNode insert(TreeNode node, int val){
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
}
