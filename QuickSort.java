public  class  QuickSort{
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int  partition(int []arr, int low , int high)
    {
            int pivot = arr[low];   

            int count = 0 ;

            for(int i = low + 1; i<=high; i++)  
            {
                if(arr[i]<=pivot)
                {
                    count++;
                }
            }

            //place pivot at right position
            int pivotind = low + count;

            swap(arr, pivotind,low);

            //left and right parth sort
            int i = low ; int j = high;

            while(i<pivotind && j>pivotind)
            {
                while(arr[i]<pivot)
                {
                    i++;
                }

                while(arr[j]>pivot)
                {
                    j--;
                }

                if( i<pivotind && j>pivotind)
                {
                    swap(arr , i++ , j--);
                }
            }
             
            return  pivotind;
    }

    public static void qs (int []arr , int low , int high)
    {   
            //base case
            if(low >= high)
            {
                return; 
            }

            //call the partition function to create a partition in array
            int p = partition(arr, low  , high);

            //do recursion

            qs(arr, low, p-1);

            qs(arr, p+1, high);


    }
    public static void main(String[] args) {
        int [] arr= {90,33,1,45,100};
        int low =0 ;
        int high = arr.length-1;

        qs(arr, low, high);

        for(int n : arr)
        {
            System.out.print(n+" ");
        }
    }   
}