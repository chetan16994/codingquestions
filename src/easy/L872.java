package easy;

import java.util.ArrayList;

public class L872 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
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

    ArrayList<Integer> li1=new ArrayList<Integer>();
    ArrayList<Integer> li2=new ArrayList<Integer>();
    public  ArrayList<Integer> inOrder(TreeNode root,ArrayList<Integer> list){

        if (root!=null){
            inOrder(root.left,list);
            if (root.left==null && root.right==null)
                list.add(root.val);
            inOrder(root.right,list);
        }
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        return inOrder(root1,li1).equals(inOrder(root2,li2));
    }
    public static void main(String[] args) {
        L872 obj=new L872();
        TreeNode root1=insert(null,9);
        insert(root1,11);
        insert(root1,13);
        insert(root1,6);
        insert(root1,4);
        insert(root1,9);

        TreeNode root2=insert(null,10);
        insert(root2,6);
        insert(root2,4);
        insert(root2,7);
        insert(root2,13);

        System.out.println(obj.leafSimilar(root1,root2));
    }
}
