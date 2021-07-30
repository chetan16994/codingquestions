package easy;

public class L404 {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        inOrder(root,root);
        return sum;
    }
    void inOrder(TreeNode root, TreeNode parent){
        if (root==null)
            return;
        if (root.left==null && root.right==null && root==parent.left){
            sum+= root.val;
        }
        inOrder(root.left,root);
        inOrder(root.right,root);
    }
    public static void main(String[] args) {
        TreeNode obj1=new TreeNode();
        TreeNode root=obj1.insert(null,3);
        obj1.insert(root,9);
        obj1.insert(root,20);
        obj1.insert(root,15);
        obj1.insert(root,7);

//        obj1.BFS(root);

        L404 obj2=new L404();
        System.out.println(obj2.sumOfLeftLeaves(root));
    }
}
