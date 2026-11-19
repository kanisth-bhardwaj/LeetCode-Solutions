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
    public List<Integer> postorderTraversal(TreeNode root) {
        // Stack < TreeNode > st1 = new Stack<>();
        // Stack < TreeNode > st2 = new Stack<>();
        // List < Integer > postorder = new ArrayList<>() ;

        // st1.push( root );
        // while( st1.isEmpty()){
        //     root = st1.pop()  ; 
        //     st2.push( root );
        //     if( root.left != null ){
        //         st1.push( root.left );
        //     }
        //     if( root.right != null ){
        //         st1.push( root.right );
        //     }
        // }
        // while( st2.isEmpty()){
        //     postorder.add(root.val);
        // }
        // return postorder ;
       

        Stack<TreeNode> st = new Stack<>();
        List<Integer> postorder = new ArrayList<>();

        TreeNode curr = root;
        TreeNode temp = null;

        while (curr != null || !st.isEmpty()) {

            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            else {
                TreeNode top = st.peek();

                if (top.right != null && top.right != temp) {
                    curr = top.right;
                }
                else {
                    postorder.add(top.val);
                    temp = st.pop();
                }
            }
        }

        return postorder;
    }
}