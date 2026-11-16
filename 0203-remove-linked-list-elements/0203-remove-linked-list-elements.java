
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = head;
        ListNode pre = null;

        while (temp != null) {

            if (temp.val == val) {

                if (pre == null) {
                    head = temp.next;
                }
                else {
                    pre.next = temp.next;
                }

            }
            else {
                pre = temp;
            }

            temp = temp.next;
        }

        return head;
    }
}
