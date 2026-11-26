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
    public boolean findTarget(TreeNode root, int k) {
        List <Integer> list = inorder( root );
        int i = 0 ;
        int j = list.size() - 1  ; 
        while( i < j ){
            int ans = list.get(i) + list.get(j);
            if( ans == k ){
                return true ; 
            }
            else if ( ans > k ){
             j--;
            }
            else{
                i++;
            }
        }
        return false ; 
        
    }
public static List<Integer> inorder( TreeNode node ){
        List<Integer> list = new ArrayList<>();
        Stack  <TreeNode> stack = new Stack<>();
        TreeNode root = node  ;
        while(true){
            if( root != null ){
                stack.push( root );
                root = root.left ; 
            }
            else{
                if( stack.isEmpty() ){
                    break ; 
                }
                root = stack.pop();
                list.add( root.val );
                root = root.right ; 

            }
        }
        return list ; 
    }
}