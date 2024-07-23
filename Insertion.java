
public  class Insertion {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int s = arr.length;
        
        
        for(int i =1 ; i < s; i++)
        {   
            int temp = arr[i];
            int j = i - 1;
                
            //shifting
                while(j>=0 && arr[j]>temp)
                {   
                    arr[j+1]= arr[j];
                    j=j-1;
                }
                arr[j+1]= temp;
        }


        for( int n : arr)
        {
            System.out.println(n+"");
        }
    }
}