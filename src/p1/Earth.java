import java.util.Scanner;

public class Earth {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int[] a = new int[6];
        int[] b = new int[6];

        System.out.println("enter a");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }
        System.out.println("enter b");
        for(int i = 0; i < a.length; i++){
            b[i] = s.nextInt();
        }

        int counter = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]==b[i])
            {
                ++counter;
            }
        }
        System.out.println(counter);
    }
}
