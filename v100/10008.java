
import java.util.*;

public class Main {
    public static void main(String agrv[]) {
        Scanner sc = new Scanner(System.in);
        int line = Integer.parseInt(sc.nextLine());
        char alp[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int count[] = new int[26];
        for (int i = 0; i < line; i++) {
            String msg = sc.nextLine();
            char[] arr = msg.toUpperCase().toCharArray();
            for (int j = 0; j < msg.length(); j++) {
                if (Character.isLetter(arr[j])) {
                    count[arr[j] - 'A']++;
                }
            }
        }
        int temp = 0;
        char ch = 0;
        for (int i = 0; i < count.length - 1; i++) {
            for (int j = 0; j < count.length - 1 - i; j++) {
                if (count[j] < count[j + 1]) {
                    temp = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = temp;

                    ch = alp[j];
                    alp[j] = alp[j + 1];
                    alp[j + 1] = ch;
                }
            }
        }
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] == count[i + 1]) {
                if (alp[i] > alp[i + 1]) {
                    ch = alp[i];
                    alp[i] = alp[i + 1];
                    alp[i + 1] = ch;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                System.out.println(alp[i] + " " + count[i]);
        }
    }
}
