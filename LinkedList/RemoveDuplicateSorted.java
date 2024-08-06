


class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Ll {

    Node head;

    public void insert(int data) {
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

    public void print() {
        Node current = head;
        if (head == null) {
            return;
        } else {

            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
        }
    }

    public void removeDuplicateSorted()
    {
        if(head == null)
        {
            return;
        }
        else{

            Node current = head;

            while(current != null && current.next != null)
            {
                if( current.val == current.next.val)
                {
                    current = current.next.next;
                    // current.next.next = null;
                }
                else{

                    current = current.next;
                }
            }
        }
    }
}

public class RemoveDuplicateSorted {

    public static void main(String[] args) {

        Ll obj = new Ll();

        obj.insert(10);
        obj.insert(10);
        obj.insert(20);
        obj.insert(20);
        obj.insert(20);
        obj.insert(30);
        obj.insert(30);
        obj.insert(250);
        
        obj.print();

        obj.removeDuplicateSorted();


        System.out.println("");
        obj.print();

    }
}
