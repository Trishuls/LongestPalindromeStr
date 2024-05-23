public class Packet {
    public static void main(String[] args) {
        int flag = 1;
        String packet = "0100100001100101011011000110110001101111";
        char[] ch = packet.toCharArray();
        int length = packet.length();
        int[] arr = new int[length/8];
        for (int i = 0; i < length/8; i++){
            String temp = "";
            for (int j = i*8; j < i*8+8; j++){
                temp+=String.valueOf(ch[j]);
            }
            arr[i] = Integer.parseInt(temp,2);
        }
        int len = arr[1];
        int key = arr[0];
        if (len!=arr.length-2 || arr.length < 2){
            flag = 0;
        }
        if (flag==1){
            String msg = "";
            for (int i = 2; i < arr.length; i++){
                msg+=String.valueOf((char) (arr[i]^key));
            }
            System.out.println(msg);
        }
        else {
            System.out.println("Invalid");
        }
    }
}
