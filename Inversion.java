public class Inversion{
    public static int in(int []arr, int low , int mid , int high)
    {   int len1 = mid-low+1;
        int len2 = high-mid;
        
        int [] a1 = new int[len1];
        int [] a2 = new int [len2];
        
        for(int i =0 ; i < len1; i++)
        {
            a1[i] = arr[low+i];
        }
        
        
        for(int i =0 ; i < len2; i++)
        {
            a2[i] = arr[mid+1+i];
        }
        
        int i = 0;
        int j =0;
        int inversion =0;
        int k=low;
        
        while(i < len1 && j < len2)
        {
            if (a1[i] <= a2[j]) {
                arr[k++] = a1[i++];
            } else {
                arr[k++] = a2[j++];
                // All remaining elements in left[] will form inversions
                inversion += (len1 - i);
            }
        }
        
        while(i < len1)
        {
            arr[k++]=a1[i++];
            
        }
        while(j < len2)
        {
            arr[k++]=a2[j++];
            
        }
        return inversion;
    }
    
    public static int ms(int [] arr , int low  , int high)
    {
        int inversion = 0;
        
        if( low < high)
        {
            int mid = low + ( high - low )/2;
            
            inversion += ms(arr , low  , mid);
            inversion += ms(arr, mid+1, high);
            inversion += in(arr, low , mid , high);
            
            
        }
        
        return inversion;
    }
    
    public static void main (String [] args)
    {
        int [] arr = {2, 4, 1, 3, 5};
        
        int low = 0 ;
        int high = arr.length -1;
        
       int res =  ms(arr, low , high);
       
       System.out.print(res);
    }
}