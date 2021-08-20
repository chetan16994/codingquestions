package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class L1038 {
    HashMap<Integer,Integer> map=new HashMap<>();
    ArrayList<Integer> arr=new ArrayList();
    int sum=0;
    public void inorder(TreeNode root){
        if (root==null) return;

        inorder(root.left);
        arr.add(root.val);
        sum += root.val;
            inorder(root.right);
    }

    public void inorderNew(TreeNode root){
        if (root==null) return;
            root.val=map.get(root.val);

        inorderNew(root.left);
        inorderNew(root.right);
    }
    public TreeNode bstToGst(TreeNode root) {
        inorder(root);

        Collections.sort(arr);
        int temp=0;
        for (int i:arr){
            map.put(i,sum-temp);
            temp=temp+i;
        }

//        map.forEach((k, v) -> System.out.println((k + ":" + v)));
        inorderNew(root);
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

        L1038 obj=new L1038();
        tree.BFS(obj.bstToGst(root));
    }
}
