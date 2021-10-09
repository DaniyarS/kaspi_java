public class MiddleNode {
    public static void main(String[] args) {
        ListNode ls = new ListNode(10, new ListNode(12, new ListNode(5, new ListNode(4))));
        System.out.println(String.valueOf(middleNode(ls)));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode[] ls = new ListNode[100];

        int t = 0;
        while (head != null) {
            ls[t++] = head;
            head = head.next;
        }

        return ls[t/2];
    }
}
