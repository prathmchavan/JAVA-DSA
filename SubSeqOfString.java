
import java.util.ArrayList;
import java.util.List;

public  class SubSeqOfString{

    public static void solve(String str , int index , List<List<String>> ans , List<String>out)
    {
        if(index >= str.length())
        {   
          

                ans.add(new ArrayList<>(out));
            return;

        }

        // execlude 

        solve(str , index+1 , ans , out);

        //include

        String element = Character.toString(str.charAt(index));
        out.add(element);
        solve(str, index+1, ans, out);
        out.remove(out.size() - 1);  // Backtrack

    }
    public static void main(String[] args) {
        String str ="abc";

        List<List<String>> ans = new ArrayList<>();
        List<String> out = new ArrayList<>();
        int index = 0;
        solve(str , index , ans , out);
        int c = 0;
        for(List<String> s : ans)
        {   c++;
            System.out.println(s);
        }

        System.out.println(c);
    }
}