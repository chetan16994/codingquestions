package easy;

public class L897_Recursion {
    public static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode (int val){
            this.val=val;
            left=right=null;
        }
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

    TreeNode cur = new TreeNode(0);
    TreeNode res = cur;

    public void inorder(TreeNode node){
        if(node == null)return;
        inorder(node.left);
        cur.left = null;
        cur.right = node;
        cur = node;
        inorder(node.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        cur.left = cur.right = null;
        return res.right;
    }


    public static void main(String[] args) {
        L897_Recursion obj= new L897_Recursion();
        TreeNode root=insert(null,5);
        insert(root,3);
        insert(root,6);
        insert(root,2);
        insert(root,4);
        insert(root,8);
        insert(root,1);
        insert(root,7);
        insert(root,9);

        System.out.println("======");
        obj.increasingBST(root);
    }
}
