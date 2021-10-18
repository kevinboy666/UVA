import java.util.*;

public class Main {
    public static void main(String agrv[]) {
        Scanner sc = new Scanner(System.in);
        String decode = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";

        while (sc.hasNextLine()) {
            String encode = sc.nextLine().toLowerCase();

            for (int i = 0; i < encode.length(); i++) {
                int index = 0;
                char ch = encode.charAt(i);
                if (ch == ' ') {
                    System.out.print(" ");
                } else {
                    index = decode.indexOf(ch) - 2;
                    System.out.print(decode.charAt(index));
                }
            }
            System.out.println();
        }
    }
}
