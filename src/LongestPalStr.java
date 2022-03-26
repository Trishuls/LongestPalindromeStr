import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestPalStr {
    public static void main(String[] args) {
        String str = "aabbddccbbaakkdddkkaabbccdd";

        List<Integer> list = palindrome(str);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.get(0));
    }
    public static List<Integer> palindrome(String str){
        int i = 0;
        int j = str.length()-1;
        List<Integer> list = new ArrayList<>();

        for (int a=0; a< str.length();a++){
            for (int b=str.length()-1;b>0;b--){
                int c = b+1;
                if (str.charAt(a)==str.charAt(b)){
                    String s = str.substring(a,c);
                    if (!"".equals(s) && s != null){
                        System.out.println(s);
                        if(checkPal(s)){
                            list.add(s.length());
                        }
                    }

                    break;
                }
            }
        }
        return list;
    }
    private static boolean checkPal(String str) {
        int i = 0;
        int j = str.length()-1;
        for (int a = 0; a < str.length(); a++){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
