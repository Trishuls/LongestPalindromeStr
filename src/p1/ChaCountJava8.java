import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChaCountJava8 {
    public static void main(String[] args) {
        String str = "ssgghhttaan";
        Map<String, Long> val = str.chars().mapToObj(c -> Character.toString((char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(val);
    }
}
