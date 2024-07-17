class  Q{
    int size ;
    int top =-1 ;
    int bot =0;
    private  int []arr;
    public Q(int size )
    {
        this.size=size;
        this.arr = new int[size];    
    }


    public void push(int n) {
        if (!isFull()) {  // Check if there's space in the Queue
            top++;
            arr[top] = n;
        } else {
            System.out.println("Queue overflow");
        }
    }
    
    public  void pop()
    { if (!isEmpty()) {  // Check for Queue underflow
        int popped = arr[bot];
        bot++;
        System.out.println("Popped: " + popped);
    } else {
        System.out.println("Queue underflow");
    }
    }

    public void print()
    { System.out.println("Queue Elements:");
    for (int i = bot; i <= top; i++) {
        System.out.println(arr[i]);
    }
    }

    public void peek()
    {   

        System.out.println("\nElement at Top : "+ arr[top]);
    }

    public boolean   isEmpty()
    {
        if (top >= bot) {
            return  false;
        }
        return true;
       
    }

    public boolean   isFull()
    {

        if (top < size - 1) { 
           return  false;
        }
        
        return true;
    }
}

public  class  Queue{

    public static void main(String[] args) {

        Q obj = new Q(5);

        obj.push(10);
        
        obj.push(20);

        obj.print();

        obj.pop();

        
        obj.print();

       

    }
}