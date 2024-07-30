class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Circular {
    Node head;

    public Circular() {
        this.head = null;
    }

    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head; // Point to itself to make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newnode;
            newnode.next = head; // Point new node to head to maintain circularity
        }
    }

    public void insertFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head; // Point to itself to make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            newnode.next = head; // New node points to old head
            current.next = newnode; // Last node points to new node
            head = newnode; // Update head to new node
        }
    }

    public void insertLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head; // Point to itself to make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newnode;
            newnode.next = head; // Point new node to head to maintain circularity
        }
    }

    public void deleteFirst()
    {
        if(head == null)
        {
            return;
        }

        if(head.next == head)
        {
            head = null;
            return;
        }

        Node current = head;

        while(current.next != head)
        {
            current = current.next;
        }
        current.next = current.next.next;
        head = head.next;
    }

    public void deleteLast()
    {
        if(head == null)
        {
            return;
        }

        if(head.next == head)
        {
            head = null;
            return;
        }

        Node current = head;

        while(current.next.next != head)
        {
            current = current.next;
        }
        current.next = head;
       
    }

    public void print() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Circular ob = new Circular();

        ob.insert(10);
        ob.insert(20);
        ob.insert(30);
        ob.insert(40);

        System.out.print("Initial Circular Linked List: ");
        ob.print();
        System.out.println();

        ob.insertFirst(5);
        System.out.print("After inserting 5 at the beginning: ");
        ob.print();
        System.out.println();

        ob.insertLast(50);
        System.out.print("After inserting 50 at the end: ");
        ob.print();
        System.out.println();


        ob.deleteFirst();
        System.out.print("After deleting at first element ");
        ob.print();
        System.out.println();
        ob.deleteFirst();
        System.out.print("After deleting at first element ");
        ob.print();
        System.out.println();


        ob.deleteLast();
        System.out.print("After deleting at last element ");
        ob.print();
        System.out.println();
        ob.deleteLast();
        System.out.print("After deleting at last element ");
        ob.print();
        System.out.println();
    }


}
