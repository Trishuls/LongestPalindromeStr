public class Palindrome {
    public static void main(String[] args) {
        int num = 141;
        int temp = num;
        int res = 0;
        int r;
        while(num>0){
            r = num%10;
            num = num/10;
            res = (res*10)+r;
        }

        if (res == temp)
            System.out.printf("palindrome");

        else
            System.out.printf("Not palindrome");
    }
}
