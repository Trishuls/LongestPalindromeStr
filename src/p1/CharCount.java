import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String str = "aabcdescfd";

        char[] ch = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : ch)
        {
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
