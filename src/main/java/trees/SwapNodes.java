package trees;

class SwapNodes {

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int x) {
         val = x;
        }

        @Override
        public String toString() {
            return "Node: " + String.valueOf(val);
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode parent = null;
        ListNode n = head;
        ListNode newHead = null;

        if (n.next != null) {
            if (n.next.next == null) {
                newHead = n.next;
                newHead.next = n;
                n.next = null;
            } else {
                newHead = head.next;

                do {
                    ListNode second = n.next;
                    n.next = n.next.next;
                    second.next = n;
                    if (parent != null) {
                        parent.next = second;
                    }

                    parent = n;
                    n = parent.next;
                } while (n != null && n.next != null);
            }
        }
        return newHead;
    }
}
