
import java.util.Scanner;

class A {

    public static int find(int[] a, int key) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }

        }
        return -1;

    }
}

public class LinearSearch {

    public static void main(String[] args) {
        int[] a = {2, 22, 6, 7, 11, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key you want to search");
        int key = sc.nextInt();

        A obj = new A();
        
        int result =  obj.find(a, key);

        if(result>0)
        {
            System.out.println("Value is present at : "+result);
        }
        else{
            System.out.println("Value is not present in array");
        }

    }

}
