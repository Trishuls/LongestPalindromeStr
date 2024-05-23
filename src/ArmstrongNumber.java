public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int res=0,r;
        while (num>0){
            r = num%10;
            num = num/10;
            res = res+(r*r*r);
        }
        if (res == temp){
            System.out.println("Armstrong");
        }
        else
            System.out.println("Not Armstrong");
    }
}
