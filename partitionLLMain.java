import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {

    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);

        ListNode b = before;
        ListNode a = after;

        ListNode cur = head;

        while (cur != null) {
            if (cur.val < x) {
                b.next = new ListNode(cur.val);
                b = b.next;
            } else {
                a.next = new ListNode(cur.val);
                a = a.next;
            }
            cur = cur.next;
        }

        b.next = after.next;
        return before.next;
    }
}

public class partitionLLMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of list
        int n = sc.nextInt();

        // Create linked list
        ListNode head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        // Input partition value
        int x = sc.nextInt();

        Solution sol = new Solution();
        ListNode result = sol.partition(head, x);

        // Print result list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
