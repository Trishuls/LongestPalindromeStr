import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,4,5,2,6,3,9,7);

        //Ascending
        Collections.sort(l);
        System.out.println(l);

        //reverse
        Collections.reverse(l);
        System.out.println(l);

        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
    }
}
