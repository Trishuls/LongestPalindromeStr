import java.util.Arrays;

public class PacketStream {
    public static void main(String[] args) {
        String input = "0100100001100101011011000110110001101111"; // Binary input as String
        StringBuilder sb = new StringBuilder(); // Some place to store the chars

        Arrays.stream( // Create a Stream
                input.split("(?<=\\G.{8})") // Splits the input string into 8-char-sections (Since a char has 8 bits = 1 byte)
        ).forEach(s -> // Go through each 8-char-section...
                sb.append((char) Integer.parseInt(s, 2)) // ...and turn it into an int and then to a char
        );

        String output = sb.toString();
        System.out.println(output);
    }
}
