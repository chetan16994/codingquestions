package medium;

import java.util.Collections;

public class L1308Improvised {
    int sum=0;
    public TreeNode bstToGst(TreeNode root){
        if (root==null)
            return null;

//        right to left inorder cuz we want to traverse highest nodes first
        if (root.right!=null)
            root.right=bstToGst(root.right);

        root.val+=sum;
        sum= root.val;

        if (root.left!=null)
            root.left=bstToGst(root.left);

        return root;
    }
    public static void main(String[] args) {

        TreeNode tree=new TreeNode();
        TreeNode root= tree.insert(null,4);
        tree.insert(root,1);
        tree.insert(root,6);
        tree.insert(root,0);
        tree.insert(root,2);
        tree.insert(root,3);
        tree.insert(root,5);
        tree.insert(root,7);
        tree.insert(root,8);

//        tree.BFS(root);

        L1308Improvised obj=new L1308Improvised();
        tree.BFS(obj.bstToGst(root));
    }
}
