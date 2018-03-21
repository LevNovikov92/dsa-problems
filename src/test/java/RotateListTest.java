import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateListTest {

    private final RotateList test = new RotateList();

    @Test
    public void rotateRight() throws Exception {
        RotateList.ListNode head = new RotateList.ListNode(0);
        RotateList.ListNode node1 = new RotateList.ListNode(1);
        RotateList.ListNode node2 = new RotateList.ListNode(2);
        RotateList.ListNode node3 = new RotateList.ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        RotateList.ListNode newHead = test.rotateRight(head, 6);
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(3, newHead.next.val);
        Assert.assertEquals(0, newHead.next.next.val);
        Assert.assertEquals(1, newHead.next.next.next.val);
        Assert.assertNull(newHead.next.next.next.next);

    }

    @Test
    public void getRealShifting() throws Exception {
        Assert.assertEquals(0, test.getRealShifting(5, 5));
        Assert.assertEquals(0, test.getRealShifting(5, 10));
        Assert.assertEquals(1, test.getRealShifting(5, 6));
        Assert.assertEquals(3, test.getRealShifting(5, 3));
    }

    @Test
    public void getListLength() throws Exception {
        RotateList.ListNode head = new RotateList.ListNode(0);
        RotateList.ListNode node1 = new RotateList.ListNode(1);
        RotateList.ListNode node2 = new RotateList.ListNode(2);
        RotateList.ListNode node3 = new RotateList.ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        Assert.assertEquals(4, test.getListLength(head));
        Assert.assertEquals(1, test.getListLength(node3));
        Assert.assertEquals(2, test.getListLength(node2));
    }

    @Test
    public void findNode() throws Exception {
        RotateList.ListNode head = new RotateList.ListNode(0);
        RotateList.ListNode node1 = new RotateList.ListNode(1);
        RotateList.ListNode node2 = new RotateList.ListNode(2);
        RotateList.ListNode node3 = new RotateList.ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        Assert.assertEquals(node1, test.findNode(2, head));
        Assert.assertEquals(head, test.findNode(1, head));
    }

    @Test
    public void cut() throws Exception {
        RotateList.ListNode head = new RotateList.ListNode(0);
        RotateList.ListNode node1 = new RotateList.ListNode(1);
        RotateList.ListNode node2 = new RotateList.ListNode(2);
        RotateList.ListNode node3 = new RotateList.ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        test.cut(head, 3);
        Assert.assertNull(node2.next);

        test.cut(head, 1);
        Assert.assertNull(head.next);
    }

}