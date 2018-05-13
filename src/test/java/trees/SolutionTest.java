package trees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void swapPairs() throws Exception {

        SwapNodes.ListNode node1 = new SwapNodes.ListNode(1);
        SwapNodes.ListNode node2 = new SwapNodes.ListNode(2);
        SwapNodes.ListNode node3 = new SwapNodes.ListNode(3);
        SwapNodes.ListNode node4 = new SwapNodes.ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        SwapNodes test = new SwapNodes();

        Assert.assertEquals("2143", printNode(test.swapPairs(node1)));
    }

    private String printNode(SwapNodes.ListNode node) {
        StringBuilder builder = new StringBuilder();
        SwapNodes.ListNode n = node;
        builder.append(node.val);

        while (n.next != null) {
            n = n.next;
            builder.append(n.val);
        }
        return builder.toString();
    }

}