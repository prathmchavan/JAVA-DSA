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
    
    public void print()
    {
        Node current = head;
        if(current == null)
        {
            System.out.println("Linkedlist is empty");
        }
        else{

            while(current!= null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }

    public void inserFirst(int data)
    {

        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }
        else{

            Node current = head;
            
            head = newNode;
            
            newNode.next = current;
        }


        
    }
   
    public void insertEnd(int data)
    {

        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }
        else{

            Node current = head;

            while(current.next !=null)
            {
                current = current.next;

            }

            
            current.next= newNode;            
            newNode.next = null;
        }


        
    }
}



public  class  Main{
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



        
        
    }
}