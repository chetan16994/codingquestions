package easy;

import java.util.*;

public class L108 {
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
    public TreeNode insert(int[] nums,int l, int r){
        if (l>r)
            return null;
        int mid=(l+r)/2;

        TreeNode root=new TreeNode(nums[mid]);
        root.left=insert(nums,l,mid-1);
        root.right=insert(nums,mid+1,r);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        L108 obj=new L108();

        obj.BFS(obj.sortedArrayToBST(new int[] {0,1,2,3,4,5,6}));
    }
}
