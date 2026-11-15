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
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null ){
            return null ; 
        }
        ListNode temp = head ;
        int x =  0 ;
         while ( temp != null){
            x++;
            temp = temp.next ; 
         }
         k = k % x ;
         while( k > 0 ){
            temp = head ; 
            while( temp.next.next != null ){
                temp = temp.next ;
            }
            ListNode last = temp.next  ;
            temp.next = null ; 
            head = addhead(head, last);
            k-- ;  

         }
         return head ; 
    }
    public static ListNode addhead(ListNode head, ListNode temp) {

        temp.next = head;

        return temp;
    }
}