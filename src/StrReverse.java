public class StrReverse {
    public static void main(String[] args) {
        String str = "abac";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());

        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println();
        if (pal(str))
            System.out.println("Palindrome");

        else
            System.out.println("Not palindrome");
    }

    static boolean pal(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
