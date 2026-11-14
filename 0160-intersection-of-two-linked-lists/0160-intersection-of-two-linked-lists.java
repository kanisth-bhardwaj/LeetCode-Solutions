
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempa = headA;
        int na = 0;

        while (tempa != null) {
            na++;
            tempa = tempa.next;
        }

        ListNode tempb = headB;
        int nb = 0;

        while (tempb != null) {
            nb++;
            tempb = tempb.next;
        }

        if (na > nb) {
            return collision(headA, headB, na - nb);
        } else {
            return collision(headA, headB, -(nb - na));
        }
    }

    public static ListNode collision(ListNode t1, ListNode t2, int d) {

        if (d > 0) {
            while (d != 0) {
                t1 = t1.next;
                d--;
            }
        } else {
            while (d != 0) {
                t2 = t2.next;
                d++;
            }
        }

        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;
    }
}
