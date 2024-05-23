import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap {
    public static void main(String[] args) {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        Iterator<Map.Entry<String,String>> map = gfg.entrySet().iterator();
        
        while (map.hasNext()){
            Map.Entry<String, String> entry = map.next();

            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        gfg.forEach((k,v) -> System.out.println("key = "+k+", value = "+v));
    }
}
