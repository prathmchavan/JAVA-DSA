class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class DoublyLinkedList {
    Node head;

    // Insert at the head of the list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    // Insert at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Insert at a specific position (1-based index)
    public void insertAtPos(int data, int position) {
        if (position <= 1 || head == null) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            insertAtEnd(data);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }

    // Delete from a specific position (1-based index)
    public void deleteAtPos(int position) {
        if (head == null) {
            return;
        }
        if (position == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position) {
            current = current.next;
            count++;
        }
        if (current == null) {
            return;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    // Traverse the list forward
    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Traverse the list backward
    public void traverseBackward() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(1);
        dll.insertAtHead(2);
        dll.insertAtEnd(3);
        dll.insertAtEnd(4);
        dll.insertAtPos(5, 3);

        System.out.println("Forward Traversal:");
        dll.traverseForward();

        System.out.println("Backward Traversal:");
        dll.traverseBackward();

        dll.deleteAtPos(3);

        System.out.println("After Deletion:");
        dll.traverseForward();
    }
}
