import java.util.*;

public class Main {
    public static void main(String[] agrv) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num == 0)
                break;
            else if (num < 10)
                System.out.println(num);
            else
                System.out.println(g(num));
        }
    }

    public static int g(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum < 10)
            return sum;
        else
            return g(sum);
    }
}
	
