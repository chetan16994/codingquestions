package easy;

public class L112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null)
            return false;

        if (root.val==targetSum && root.left==null && root.right==null)
            return true;

        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
    public static void main(String[] args) {
        TreeNode obj1=new TreeNode();
        TreeNode root=obj1.insert(null,6);
        obj1.insert(root,4);
        obj1.insert(root,7);
//        obj1.insert(root,2);
        obj1.insert(root,1);
//        obj1.insert(root,5);
        obj1.insert(root,9);

        L112 obj2=new L112();
        System.out.println(obj2.hasPathSum(root,2));
    }
}
