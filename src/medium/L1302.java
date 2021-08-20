package medium;

public class L1302 {
    int sum=0;
    int max = Integer.MIN_VALUE;
    public int deepestLeavesSum(TreeNode root) {
        depth(root,1);
        return sum;
    }
    public void depth(TreeNode root,int depth){
        if(root == null)return;

        depth(root.left,depth+1);

        if(depth > max){
            max = depth;
            sum = root.val;
        }else if(depth == max)sum += root.val;

        depth(root.right,depth+1);
    }

    public static void main(String[] args) {
        TreeNode tree=new TreeNode();

    }
}
