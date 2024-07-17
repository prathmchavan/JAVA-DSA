public  class  CircularGame{
    public static void main(String[] args) {
        int n =5;
        int k=3;
        int as =check(n, k)+1;

        System.out.println(""+as);

    }


    public static int check ( int n , int k)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            int res = (check(n-1, k)+k)%n;
            return res;
        }
    }
}