import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {

//        String str = "HAPPIESTMINDS";
//
//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for (int i = 0; i< str.length(); i++)
//        {
//            if (map.containsKey(str.charAt(i)))
//            {
//                int count = map.get(str.charAt(i));
//                map.put(str.charAt(i),count+1);
//            }
//            else
//            {
//                map.put(str.charAt(i),1);
//            }
//        }
//        System.out.println(map);
        List<String> list = Arrays.asList("hello", "hi", "lohel", "lehole", "holle");
        List<String> result = new ArrayList<>();

        String str = "hello";

        for (String s : list)
        {
            System.out.println(s);
            List<Character> comp = Arrays.asList('h','e','l','l','o');
            System.out.println(comp);
            if(compare(s,comp))
            {
                result.add(s);
            }
        }
        System.out.println(result);
    }

    private static boolean compare(String s, List<Character> comp) {
        for (int i = 0; i<s.length();i++)
        {
            if (!comp.isEmpty())
            {
                if (comp.contains(s.charAt(i)))
                {
                    comp.remove(s.charAt(i));
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}

