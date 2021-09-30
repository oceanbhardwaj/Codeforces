/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bst(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode bst(int preorder[],int inorder[],int prestart,int preend,int instart,int inend)
    {
        if(inend<0 || preend<0 || prestart>=preorder.length || instart>=inorder.length || instart>inend || prestart>preend || prestart<0 || instart<0)
        {
            return null;
        }
        TreeNode root=new TreeNode(preorder[prestart]);
        //finding index in inorder
        int value=preorder[prestart];
        int index=-1;
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==value)
            {
                index=i;
                break;
            }
        }
        root.left=bst(preorder,inorder,prestart+1,preend,instart,index-1);
        root.right=bst(preorder,inorder,prestart+index-instart+1,preend,index+1,inend);
        return root;
        
    }
}