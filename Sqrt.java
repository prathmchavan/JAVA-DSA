public class  Sqrt{
    public static void main(String[] args) {
            //find the nearest sqrt of n
            //using o(logn)complexity


            int n =32;
            int low =0 ;
            int high= n-1;
            int as =0;
            while(low<= high)
            {
                int mid= low+(high-low)/2;
                int sq =mid*mid;
                if(sq==n)
                {
                    System.out.println(""+mid);
                }
                else if(sq<n){
                    as = mid;
                    low= mid+1;
                }
                else{
                    high = mid-1;
                }

                
            }
            System.out.println(""+as);
            
    }
}