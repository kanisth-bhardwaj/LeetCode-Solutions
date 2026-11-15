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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head ; 
        ListNode prenode = null ; 
        while( temp != null ){
            ListNode knode = Kthnode( temp , k );
            if( knode == null ){
                if(prenode != null ){ prenode.next = temp ; }
                break ;
            }
            ListNode  newnode = knode.next ;
            knode.next = null ;
            reverse( temp );
            if( temp  == head ){
                head = knode ; 
            }
            else{
                prenode.next = knode ; }
                prenode = temp ; 
                temp = newnode  ; 
            
        }
        return head ; 
        
    }
    public static ListNode Kthnode(ListNode head , int k ){
        ListNode temp = head ; 
        while( temp != null && k > 1){
            k-- ; 
            temp = temp.next ; 
        }
        return temp ; 
    }
    public static ListNode reverse( ListNode head ){
        ListNode pre = null ;
        ListNode current = head ; 
        ListNode nex = null ;
        while( current != null ){
            nex = current.next ;
            current.next = pre ; 
            pre = current ; 
            current = nex ; 
        }
        return pre  ; 
    }
}