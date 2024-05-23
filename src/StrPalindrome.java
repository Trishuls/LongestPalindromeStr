public class StrPalindrome {
    static boolean isPalindrome(String str){
        int i = 0,j = str.length()-1;
        for (int a = 0; a<str.length(); a++){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String val = "qwwqe";
        if (isPalindrome(val))
            System.out.println(val+" is palindrome");
        else
            System.out.println(val+" is not palindrome");
    }
}
