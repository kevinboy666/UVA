import java.util.*;

public class Main {
    public static void main(String[] agrv) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int x = Integer.parseInt(sc.nextLine());
            String[] arr = sc.nextLine().split("\\s+");    //跳過多個空格
            int[] num = new int[arr.length];

            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(arr[i]);
            }

            long an = 0, n = num.length - 1;
            an = num[0] * (n--);                        //秦九韶
            for (int i = 1; i < num.length - 1; i++) {
                an = an * x + num[i] * (n--);
            }
            System.out.println(an);
        }
    }
}
