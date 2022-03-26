import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Code {

    public static void main(String[] args) {
        String str = "pabcabxabyba";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        List<Character> list = new ArrayList<>();

        for (int i = 0; i< str.length()-1; i++)
        {
            if (map.containsKey(str.charAt(i)))
            {
                Integer count = map.get(str.charAt(i));
                map.put(str.charAt(i),count+1);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }

        System.out.println(map);
        for (Map.Entry<Character,Integer> m : map.entrySet())
        {
            if (m.getValue()==1)
            {
                list.add(m.getKey());
            }
        }
        if (!list.isEmpty())
        {
            System.out.println(list.get(1));
        }
    }
}
