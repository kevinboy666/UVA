import java.util.*;

public class Main {
    public static void main(String[] agrv) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long s = sc.nextLong();
            long d = sc.nextLong();
            while (d > s) {
                d = d - s;
                s++;
            }
            System.out.println(s);
        }
    }
}
