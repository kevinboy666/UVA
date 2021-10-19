import java.util.*;

public class Main {
    public static void main(String agrv[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (count % 2 == 0)
                count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '"') {
                    count++;
                    if (count % 2 == 1)
                        System.out.print("``");
                    else
                        System.out.print("''");
                } else
                    System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
