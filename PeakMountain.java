public class PeakMountain{
   public static void main(String[] args) {
       
        int [] arr ={1,2,7,5,6};

        int low =0 ;
        int high = arr.length-1;

        while(low<high)
        {
            int mid = low +(high-low)/2;

            if(arr[mid]<arr[mid+1])
            {
                low = mid+1;
            }
            else{
                high = mid;
            }
        }

        System.out.println(""+low);



   }
}