public class  SqOfX{
    public static void main(String[] args) {
        int n =32;

        if(n==0){
            System.out.println("False");
        }
        else{

            

            System.out.println((n & (n-1)) == 0);
        }

    }
}