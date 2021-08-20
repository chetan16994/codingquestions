package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L1305 {
    ArrayList<Integer> al = new ArrayList<Integer>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2)
    {
        in(root1);
        in(root2);
        Collections.sort(al);
        return al;
    }
    public void in(TreeNode root)
    {
        if(root==null)
            return ;
        in(root.left);
        al.add(root.val);
        in(root.right);
    }
}
