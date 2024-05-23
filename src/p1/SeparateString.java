import java.util.ArrayList;
import java.util.List;

public class SeparateString {
    public static void main(String[] args) {
        String binary = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(splitStr(binary,8));
    }

    private static List<String> splitStr(String binary, int size) {
        List<String> parts = new ArrayList<>();
        int len = binary.length();
        for (int i = 0; i < len; i+=size){
            String str = binary.substring(i, Math.min(len, i + size));
            if (str.length() < size){
                parts.add(padStrLeft(str,'0',8));
            }
            else {
                parts.add(str);
            }
        }
        return parts;
    }

    private static String padStrLeft(String str, char c, int i) {
        return String.format("%"+ i + "s",str).replace(' ',c);
    }
}
