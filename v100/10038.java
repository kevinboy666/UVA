import java.util.*;

public class Main {
    public static void main(String[] agrv) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int len = sc.nextInt();
            int[] nums = new int[len];
            int[] diff = new int[len - 1];
            boolean jolly = true;

            for (int i = 0; i < len; i++) {
                nums[i] = sc.nextInt();
            }
            if (len == 1) {
                System.out.println("Jolly");
                continue;
            }
            for (int i = 0; i < len - 1; i++) {
                diff[i] = Math.abs(nums[i] - nums[i + 1]);
            }
            Arrays.sort(diff);
            for (int i = 0; i < len - 1; i++) {
                if (diff[i] < 1 || diff[i] > len - 1 || diff[i] != i + 1) {
                    jolly = false;
                    System.out.println("Not jolly");
                    break;
                }
            }
            if (jolly)
                System.out.println("Jolly");
        }
    }
}
