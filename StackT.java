class  S{
    int size ;
    int top =-1 ;
    private  int []arr;
    public S(int size )
    {
        this.size=size;
        this.arr = new int[size];    
    }


    public void push(int n) {
        if (!isFull()) {  // Check if there's space in the stack
            top++;
            arr[top] = n;
        } else {
            System.out.println("Stack overflow");
        }
    }
    
    public  void pop()
    { if (!isEmpty()) {  // Check for stack underflow
        int popped = arr[top];
        top--;
        System.out.println("Popped: " + popped);
    } else {
        System.out.println("Stack underflow");
    }
    }

    public void print()
    { System.out.println("Stack Elements:");
    for (int i = 0; i <= top; i++) {
        System.out.println(arr[i]);
    }
    }

    public void peek()
    {   

        System.out.println("\nElement at Top : "+ arr[top]);
    }

    public boolean   isEmpty()
    {
        if (top >= 0) {
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

public  class  StackT{

    public static void main(String[] args) {

        S obj = new S(5);

        obj.push(10);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(90);
        obj.push(900);


        obj.print();

        // obj.pop();
        
        // obj.pop();
        
        // obj.pop();
        
        // obj.pop();
        
        // obj.pop();
        
        
        obj.peek();
        obj.pop();
        
        obj.peek();

    }
}