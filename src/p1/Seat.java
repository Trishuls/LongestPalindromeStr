import java.util.Scanner;

public class Seat {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1};
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        while (true){
            switch (i){
                case 1:{
                    add(arr);
                }
                case 2:{
                    System.out.println("enter position");
                    int index = s.nextInt();
                    remove(index,arr);
                }
                default:
                    System.out.println("nothing");
            }
        }

    }

    public static void add(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                int a = i;
                ++a;
                System.out.println("open at "+a);
                break;
            }
        }
    }
    public static void remove(int index, int[] arr){
        if (arr[index-1] != 0){
            arr[index-1] = 0;
        }
        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
