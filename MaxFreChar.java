package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxFreChar {
    public static void main(String[] args) {
        System.out.println(maxfre("abhiabhabawwed"));
    }
    private  static char maxfre(String str)
    {
        HashMap<Character,Integer> fre=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(fre.containsKey(str.charAt(i))) {
                int of = fre.get(str.charAt(i));
                int nf = of + 1;
                fre.put(str.charAt(i), nf);
            }
            else
            {
                fre.put(str.charAt(i),1);
            }
        }
        System.out.println(fre);
        ArrayList<Character>List=new ArrayList<>(fre.keySet());
        char maxchar=' ';
        int maxfre=0;
        for(char ch:List)
        {
            if(fre.get(ch)>maxfre)
            {
                maxfre=fre.get(ch);
                maxchar=ch;
            }
        }
        return maxchar;

    }
}
