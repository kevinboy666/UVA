import java.util.*;

public class Main {
    public static void main(String agrv[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int people = sc.nextInt();
            double p = sc.nextDouble();
            int ith = sc.nextInt();
            if (p == 0)
                System.out.println("0.0000");
            else
                System.out.printf("%.4f\n", (p * Math.pow(1 - p, ith - 1)) / (1 - Math.pow(1 - p, people)));
        }
    }
}
