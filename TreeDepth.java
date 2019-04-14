public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        else
            return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
        
    }
}
