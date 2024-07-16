
public class BubbleSort {

    public static void main(String[] args) {

        int [] arr = { 1,40,2,50};

        for(int i =0 ; i< arr.length; i++)
        {
            for(int j =0 ; j< arr.length-i -1 ; j++)
            {
                int temp ;
                
                if(arr[j]>arr[j+1])
                {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }

            }

        }

        for( int n : arr)
        {
            System.out.println(n);
        }

        

    }   
}
