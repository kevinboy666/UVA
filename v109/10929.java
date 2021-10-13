
import java.util.*;

public class Main {
    public static void main(String agrv[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            a = a.trim();
            if (a.equals("0"))
                break;
            else {
                int lnum = 0, rnum = 0;
                String b = a;
                String arr[] = b.split("");
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 == 0)
                        lnum += Integer.parseInt(arr[i]);
                    else
                        rnum += Integer.parseInt(arr[i]);
                }
                if ((lnum - rnum) % 11 == 0)
                    System.out.printf("%s is a multiple of 11.\n", b);
                else
                    System.out.printf("%s is not a multiple of 11.\n", b);
            }
        }
    }
}
