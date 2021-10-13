import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            String str = String.format("%d %d", num1, num2);
            int x = 0;
            int c = 1;
            int max = 1;
            if (num1 > num2) {      //swap
                num1 = num1 + num2;
                num2 = num1 - num2;
                num1 = num1 - num2;
            }
            for (int i = num1; i <= num2; i++) {
                x = i;
                c = 1;
                while (x != 1) {
                    if (x % 2 == 1)
                        x = 3 * x + 1;
                    else
                        x = x / 2;
                    c++;
                }
                if (c > max)
                    max = c;
            }
            System.out.printf("%s %d", str, max);
            System.out.println();
        }
    }
}
