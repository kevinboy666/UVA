import java.util.*;

public class Main {
    public static void main(String agrv[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String day[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < cases; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            d += 4;
            for (int j = 1; j < m; j++) {
                d += month[j - 1];
            }
            System.out.println(day[d % 7]);
        }
    }
}
