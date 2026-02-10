class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class insertGCDLinked {

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode cur = head;

        while (cur != null && cur.next != null) {

            int g = gcd(cur.val, cur.next.val);

            ListNode newNode = new ListNode(g);

            newNode.next = cur.next;
            cur.next = newNode;

            cur = newNode.next;    
        }

        return head;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        head.next = new ListNode(6);
        head.next.next = new ListNode(8);

        insertGCDLinked obj = new insertGCDLinked();

        System.out.println("Original List:");
        printList(head);

        head = obj.insertGreatestCommonDivisors(head);

        System.out.println("\nAfter inserting GCD nodes:");
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
