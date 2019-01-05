/**
 * Created by Administrator on 2017/7/13.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(8);
        a1.next = a2;

        ListNode b1 = new ListNode(0);

        ListNode res = addTwoNumbers.addTwoNumbers(a1, b1);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;

        ListNode cur = new ListNode(0);
        ListNode listNode = cur;
        int plus = 0;
        while (c1 != null || c2 != null) {
            int s = (c1 == null ? 0 : c1.val) + (c2 == null ? 0 : c2.val) + plus;
            cur.val = s % 10;
            plus = s > 9 ? 1 : 0;
            if ((c1 != null && c1.next != null) || (c2 != null && c2.next != null) || plus > 0) {
                cur.next = new ListNode(1);
            }

            c1 = c1 == null ? null : c1.next;
            c2 = c2 == null ? null : c2.next;
            cur = cur.next;
        }
        return listNode;
    }
}
