package easy;

import java.util.*;

public class L530 {
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
    public  TreeNode insert(TreeNode node, int val){
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
    ArrayList<Integer> arr=new ArrayList<>();
    public void inOrder(TreeNode root){
        if (root!=null){
            inOrder(root.left);
            arr.add(root.val);
            inOrder(root.right);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.size()-1; i++) {
            min=Math.min(Math.abs(arr.get(i) - arr.get(i + 1)),min);
        }
        min=Math.min(Math.abs(arr.get(0) - arr.get(arr.size()-1)),min);
        return min;
    }
    public static void main(String[] args) {
        L530 obj=new L530();
        TreeNode root=obj.insert(null,1);
        obj.insert(root,0);
        obj.insert(root,48);
        obj.insert(root,12);
        obj.insert(root,49);

//        BFS(root);
        System.out.println(obj.getMinimumDifference(root));
    }

}
