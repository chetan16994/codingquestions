package medium;

public class L654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solve(nums,0,nums.length-1);
    }
    public TreeNode solve(int[] nums,int from, int to){

        if (from>to) return null;
        if (from==to) return new TreeNode (nums[from]);

        int maxID=maxIndex(nums,from,to);

        TreeNode root=new TreeNode(nums[maxID]);

        root.right=solve(nums,maxID+1,to);

        root.left=solve(nums,from,maxID-1);

        return root;
    }
    public int maxIndex(int[] nums, int from, int to){
        int max=-1;
        int index=-1;

        for (int i = from; i <=to ; i++) {
            if (max<nums[i]){
                max=nums[i];;
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        L654 obj=new L654();
        TreeNode tree=new TreeNode();
        tree.BFS(obj.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5}));
    }
}
