package hashmap;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap <String,Integer> lang=new HashMap<>();
        lang.put("java",20);
        lang.put("c++",54);
        lang.put("sql",34);
        lang.put("javascript",56);
        System.out.println(lang);
        System.out.println(lang.entrySet());
        System.out.println(lang.isEmpty());
        System.out.println(lang.get("java"));
        System.out.println(lang.size());
        lang.replace("c++",20);
        lang.remove("sql");
        System.out.println(lang);


    }
}
