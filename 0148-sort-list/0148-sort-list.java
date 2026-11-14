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
    public ListNode sortList(ListNode head) {
        ListNode temp = head ;
        int x = len(head);
        int[] arr = new int[x];
        int i = 0 ;  
        while( temp != null ){
            arr[i] = temp.val ;
            i++;
            temp = temp.next ; 
        }
        Arrays.sort(arr);
        int j = 0 ; 
        ListNode t2 = head ; 
        while( t2 != null ){
            t2.val = arr[j];
            j++;
            t2 = t2.next ; 
        }
        return head  ; 
    }
    public static int len( ListNode head ){
        ListNode temp = head ; 
        int count = 0 ; 
        while( temp != null ){
            count++ ;
            temp = temp.next ;
        }
        return count ; 
    }
}