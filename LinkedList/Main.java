
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    public LinkedList() {
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

    public void print() {
        Node current = head;
        if (current == null) {
            System.out.println("Linkedlist is empty");
        } else {

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public void inserFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            Node current = head;

            head = newNode;

            newNode.next = current;
        }

    }

    public void insertEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;

            }

            current.next = newNode;
            newNode.next = null;
        }

    }

    public void insertPos(int data, int position) {
        Node newNode = new Node(data);
        if (position <= 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        int count = 1;
        Node current = head;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteFirst() {

        if (head == null) {
            return;
        } else {

            head = head.next;
        }
    }

    public void deleteLast() {

        if (head == null) {
            return;
        } else {

            Node current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            current.next = null;
        }
    }

    public void deleteatPos(int position) {
        if (head == null) {
            return; // List is empty
        }
    
        // If head needs to be removed
        if (position <= 1) {
            head = head.next;
            return;
        }
    
        int count = 1;
        Node current = head;
    
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
    
        // If position is out of bounds
        if (current == null || current.next == null) {
            return;
        }
    
        // Delete the node at the given position
        current.next = current.next.next;
    }


    public void reverse()
    {
        if(head == null)
        {
            return;
        }

        Node prev = null;
        Node next = null;
        Node current = head;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    
}

public class Main {

    public static void main(String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println("\n normal printing");
        nums.print();
        nums.inserFirst(90);

        System.out.println("Printing after inserting at 1st");

        nums.print();

        nums.insertEnd(100);

        System.out.println("\nAfter inserting at end");
        nums.print();

        nums.insertPos(900, 3);
        System.out.println("\nAfter inserting at position");
        nums.print();

        nums.deleteFirst();
        System.out.println("\nAfter deleting at first position");
        nums.print();

        nums.deleteLast();
        System.out.println("\nAfter deleting at last position");
        nums.print();

        nums.deleteatPos(2);
        System.out.println("\nAfter deleting at  position");
        nums.print();


        nums.reverse();
        System.out.println("\nAfter reverse operation");
        nums.print();
    }
}
