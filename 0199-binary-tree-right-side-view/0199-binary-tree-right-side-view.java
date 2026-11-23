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
    public List<Integer> rightSideView(TreeNode root) {
        List <Integer> result = new  ArrayList<>();
        int level = 0 ; 
        function( root , result , level );
        return result ; 

        
    }
    public static void function( TreeNode root , List result , int level ){
        if( root == null ){
            return ; 
        }
        if( level == result.size()){
            result.add( root.val ); 
        }
        function( root.right , result , level+1 );
        function( root.left , result , level+1 );
    }
}