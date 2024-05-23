import sun.security.util.ArrayUtil;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3,6};
        int temp;

        for (int a = 0; a <= arr.length-1; a++){
            for (int b = 0; b <= arr.length-2; b++){
                if (arr[b] < arr[b+1]){
                    temp = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = temp;
                }
            }
        }
        for (int num : arr){
            System.out.println(num);
        }
        for (int i = arr.length-1; i >=0; i--){
            System.out.println(arr[i]);
        }
    }
}
