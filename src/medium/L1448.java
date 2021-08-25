package medium;

public class L1448 {
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);
    }
    public int dfs(TreeNode root, int max){
        if(root==null)
            return 0;
        int count=0;
        if(root.val>=max){
            max=root.val;
            count=1;
        }

        return count + dfs(root.left,max) + dfs(root.right,max);
    }
}
