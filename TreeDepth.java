public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left!=null&root.right!=null){
            return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
        }
        else if(root.left!=null&root.right==null)
            return 1+TreeDepth(root.left);
        else if(root.left==null&root.right!=null)
            return 1+TreeDepth(root.right);
        else
            return 1;
    }
}
