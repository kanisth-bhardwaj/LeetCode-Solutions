/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head ;
        Stack <Integer> container = new Stack();
        while( temp != null ){
            container.push(temp.val);
            temp = temp.next ;
        }
        ListNode temp2 = head ; 
        while( temp2 != null){
            if( temp2.val != container.pop() ){
                return false ; 
            }
            temp2 = temp2.next ; 
        }
        return true ; 
        
    }
}