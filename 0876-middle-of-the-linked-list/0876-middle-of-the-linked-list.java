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
    public ListNode middleNode(ListNode head) {
        int x= trac(head);
        int middle = 0 ; 
        if( x % 2  == 0 ){
            middle = x/2 + 1;
        }
        else{
             middle =(int) (x + 1) / 2;
        }
        ListNode temp = head ; 
        int count = 0 ; 
        while(temp != null ){
            count++ ;
            if(count  >=   middle){
                return temp ; 
            }
            temp = temp.next ;

        }
        return head ; 
        
    }
    public static int trac(ListNode head ){
        ListNode temp = head ;
        int count = 0 ;
        while( temp != null ){
            count++;
            temp = temp.next ;
        }
        return count ; 
    }
}