package easy;

public class L104 {
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
    private int counter=1;
    private int max=0;

    public void preOrder(TreeNode root){
        if(root!=null){

            counter++;
            if(root.left==null && root.right==null){
                max= Math.max(counter, max);
                counter=0;
            }
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
//
//        int leftHeight=maxDepth(root.left);
//        int rightHeight=maxDepth(root.right);
        int ans=Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
        return ans;
    }
    public static void main(String[] args) {
        L104 obj=new L104();
        TreeNode root=insert(null,3);
        insert(root,2);
        insert(root,15);
        insert(root,20);
        insert(root,7);
//        insert(root,21);

        System.out.println(obj.maxDepth(root));

    }
}
