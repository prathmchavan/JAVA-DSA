class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class K {

    Node head;

    public K() {
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

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node revrec(Node head , int k)
    {
        if(head == null)
        {
            return null;
        }
        /*
         *Important Notes this code section for if asked that if k is 3 and there are no enough element then don't swap those print them as their order then use this logic 
         what we are doing is we are calculating the lenght of list then we are only swapping for len> k means if there are engough element then only we are swapping else we are stopping operation and returning the current head
          
         
        int len =0;
        Node temp =head;
        while(temp != null)
        {
            temp = temp.next;
            len++;
            
        }

        if(len < k)
        {
            return head;
        }
            */

        Node prev = null;
        Node next = null;
        Node current = head;
        int count =0;
        while(current != null && count < k)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count ++;

        }

        if(next != null)
        {

            head.next = revrec(next , k);
        }

        return  prev;
        
    }

    public void rev(int k)
    {
        head = revrec( head , k);
    }
}

public class ReverseListKGroup{
    public static void main(String[] args) {
        
        K ob = new K();

        ob.add(10);
        ob.add(90);
        ob.add(23);
        ob.add(50);
        ob.add(63);
        System.out.print("Original List: ");
        ob.printList();

        int k = 3;

        ob.rev(k);
        System.out.print("Reversed list List: ");
        ob.printList();
    }
}