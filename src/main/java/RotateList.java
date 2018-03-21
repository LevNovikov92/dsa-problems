public class RotateList {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        int listLength = getListLength(head);
        final int shifting = getRealShifting(listLength, k);
        if (shifting == 0) return head;
        final int cutPoint = listLength - shifting;
        ListNode newHead = findNode(cutPoint + 1, head);
        cut(head, cutPoint);
        return concat(newHead, head);
    }

    private ListNode concat(ListNode newHead, ListNode head) {
        ListNode node = newHead;
        while (node.next != null) {
            node = node.next;
        }

        node.next = head;
        return newHead;
    }

    void cut(ListNode head, int cutPoint) {
        int i = 1;
        ListNode node = head;
        while (node != null) {
            if (i == cutPoint) {
                node.next = null;
                return;
            }
            i++;
            node = node.next;
        }
        throw new UnsupportedOperationException();
    }

    ListNode findNode(int nodeIndex, ListNode head) {
        int i = 1;
        ListNode node = head;
        while (node != null) {
            if (i == nodeIndex) return node;
            i++;
            node = node.next;
        }
        return null;
    }

    int getRealShifting(int listLength, int k) {
        return k % listLength;
    }

    int getListLength(ListNode head) {
        ListNode node = head;
        int i = 1;
        while (node.next != null) {
            node = node.next;
            i++;
        }
        return i;
    }
}
