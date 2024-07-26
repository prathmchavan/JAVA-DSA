

class Testing {
    public static boolean check(int n)
    {
        // Handle negative numbers by converting to positive
        if (n < 0) {
            n = -n;
        }

        // Base case: If n becomes 0, it means it is divisible by 3
        if (n == 0) {
            return true;
        }

        // Base case: If n is less than 3 but not 0, it's not divisible by 3
        if (n < 3) {
            return false;
        }

        // Recursive case: Subtract 3 and check again
        return check(n - 3);
    }
    public static void main(String[] args) {    

        int val =27;
        
        boolean c = check(val);

        System.out.println(c);

    }

}
