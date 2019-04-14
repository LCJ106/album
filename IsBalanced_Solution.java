//评论区又有更好的解法，，，等下看
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        else
            return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
        
    }
    public boolean IsBalanced_Solution(TreeNode root) {
            if (root==null)
                return true;
            if(IsBalanced_Solution(root.right)&IsBalanced_Solution(root.left)&
               Math.abs(TreeDepth(root.right)-TreeDepth(root.left))<=1)
                return true;
            else
                return false;
        }
}
