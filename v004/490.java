import java.util.*;

public class Main {
    public static void main(String[] agrv) {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        int len = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            input.add(str);
            if (str.length() > len)
                len = str.length();
        }
        Collections.reverse(input);
        for (int i = 0; i < len; i++) {
            for (String s : input) {
                if (s.length() > i)
                    System.out.print(s.charAt(i));
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
