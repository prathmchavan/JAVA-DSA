class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class Test {

    Node head;

    public Test() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverse() {
        // if (head == null) {
        //     return;
        // }

        // Node prev = null;
        // Node next = null;
        // Node current = head;

        // while (current != null) {
        //     next = current.next; // Store the next node
        //     current.next = prev; // Reverse the current node's pointer
        //     prev = current;      // Move the prev pointer one step forward
        //     current = next;      // Move the current pointer one step forward
        // }
        // head = prev; // Update the head to the new front of the list


        //using recursion

        head = rec(head);
    }

    public Node rec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = rec(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ReverseLinkedList {

   

    public static void main(String[] args) {
        Test ob = new Test();

        ob.add(10);
        ob.add(90);
        ob.add(23);

        System.out.print("Original List: ");
        ob.printList();

        ob.reverse();

        System.out.print("Reversed List: ");
        ob.printList();


        ob.reverse();
        System.out.print("Reversed List using recursion: ");
        ob.printList();
    }
}
