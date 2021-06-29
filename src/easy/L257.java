package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L257 {
    public List<String> li=new ArrayList<>();
    String str="";
    public void inOrder(TreeNode root,String str){
        if (root!=null){
            str+=root.val+"->";
            if (root.left==null && root.right==null) {
                System.out.println(str);
                li.add(str);
//                str="";
            }
            inOrder(root.left,str);
            inOrder(root.right,str);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        dfs(paths, new String(), root);

        return paths;
    }

    void dfs(List<String> paths, String path, TreeNode root){
        if(root == null){
            return;
        }
        path+=root.val;
        if (root.left==null && root.right==null){
            paths.add(path);
        }
        dfs(paths,path+"->",root.left);
        dfs(paths,path+"->",root.right);
    }
    public static void main(String[] args) {
        TreeNode obj1=new TreeNode();
        TreeNode root=obj1.insert(null,3);
        obj1.insert(root,1);;
        obj1.insert(root,5);;
        obj1.insert(root,2);;

        obj1.BFS(root);

        L257 obj=new L257();
        System.out.println(obj.binaryTreePaths(root));

    }
}
