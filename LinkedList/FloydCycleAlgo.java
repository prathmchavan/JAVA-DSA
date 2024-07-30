class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class FloydCycleAlgo {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) { // Corrected the condition
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // Connect nodes to form a cycle: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (cycle)
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3; // Creates the cycle

        FloydCycleAlgo cycleDetector = new FloydCycleAlgo();
        boolean hasCycle = cycleDetector.hasCycle(node1);
        System.out.println("Cycle detected: " + hasCycle);

        // Create another list without a cycle: 1 -> 2 -> 3 -> 4 -> 5
        ListNode nodeA = new ListNode(1);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);
        ListNode nodeD = new ListNode(4);
        ListNode nodeE = new ListNode(5);

        // Connect nodes to form a non-cyclic list: 1 -> 2 -> 3 -> 4 -> 5
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        boolean hasCycle2 = cycleDetector.hasCycle(nodeA);
        System.out.println("Cycle detected: " + hasCycle2);
    }
}
