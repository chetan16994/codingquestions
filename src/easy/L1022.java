package easy;

import java.util.LinkedList;
import java.util.Queue;

public class L1022 {
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

  static TreeNode root;
    public static void insert(TreeNode node, int val){
        if (node==null)
            root=new TreeNode(val);

        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(node);

        while (!q.isEmpty()){
            node =q.peek();
            q.remove();
            if (node.left==null) {
                node.left = new TreeNode(val);
                break;
            }
            else
                q.add(node.left);

            if (node.right==null){
                node.right=new TreeNode(val);
                break;
            }
            else
                q.add(node.right);
        }
    }
    private int sum=0;
    public  void preOrder(TreeNode root,int num){
        if (root!=null) {
            num = num<<1 ;
            num+= root.val;
//            num= num<<1 | 1  bitwise and
            if (root.left==null && root.right==null) {
                sum=sum+num;
                num=0;
            }
            preOrder(root.left,num);
            preOrder(root.right,num);
        }
    }
    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    public int sumRootToLeaf(TreeNode root) {
        preOrder(root,0);
        return sum;
    }

    public static void main(String[] args) {
        L1022 obj=new L1022();
        root=new TreeNode(1);
        insert(root,0);

        insert(root,1);
        insert(root,0);
        insert(root,1);
        insert(root,0);
        insert(root,1);

//        preOrder(root,0);
        System.out.println(obj.sumRootToLeaf(root));

    }


}
