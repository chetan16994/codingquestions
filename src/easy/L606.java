package easy;

public class L606 {

    public String tree2str(TreeNode root) {
        StringBuilder path=new StringBuilder();
//        path.append(root.val);
        preorder(root,path);
//        preorder(root.left,path);
        return path.toString();
    }

    void preorder(TreeNode root, StringBuilder path){
        if (root==null)
            return;
        if (root.left==null && root.right==null)
            path.append(")");
        else
            path.append("("+root.val);
        preorder(root.left,path);
        preorder(root.right,path);

    }

    public static void main(String[] args) {
        TreeNode obj1=new TreeNode();
        TreeNode root=obj1.insert(null,3);
        obj1.insert(root,2);;
        obj1.insert(root,4);;
        obj1.insert(root,1);;

        obj1.BFS(root);
        L606 obj2=new L606();
        System.out.println(obj2.tree2str(root));
    }
}
