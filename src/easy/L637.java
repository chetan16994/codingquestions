package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L637 {
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

    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> arr=new ArrayList<Double>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int counter=0;
        double sum=0;
        while (!q.isEmpty()){
            sum=0;
            int size=q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp=q.poll();
                sum+=temp.val;
                if (temp.left!=null)
                    q.add(temp.left);
                if (temp.right!=null)
                    q.add(temp.right);
            }
            arr.add(sum/size);
        }
        return arr;
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
    public static void main(String[] args) {
        L637 obj=new L637();
        TreeNode root=insert(null,6);
        insert(root,8);
        insert(root,11);
        insert(root,4);
        System.out.println(obj.averageOfLevels(root));

    }
}
