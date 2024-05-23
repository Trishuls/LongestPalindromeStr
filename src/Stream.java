import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(1,2,3,4,5,6);

//        System.out.println(value.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
//        System.out.println(value.stream().map(i -> i*2).reduce(0,(c,e) -> Integer.sum(c,e)));
//        System.out.println(value.stream().map(i -> i*2).reduce(0,Integer::sum));

//        //check for integer
//        System.out.println(value.stream().filter(i -> i%2==0).reduce(0,Integer::sum));
//        System.out.println(value.stream().filter(i -> i%2==0).map(i -> i*2).findFirst().orElse(0));

        //overcome lazy evaluation for findFirst()
        System.out.println(value.stream().filter(Stream::isDivisible).map(Stream::mapDouble).findFirst().orElse(0));
    }

    public static boolean isDivisible(int i){
        return i%5==0;
    }
    public static int mapDouble(int i){
        return i*2;
    }
}
