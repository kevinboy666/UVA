import java.util.*;

public class Main {
    public static void main(String[] agrv) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        if (len == 0)
            return;
        String[] country = new String[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            String n = sc.nextLine();
            n = n.trim();
            String[] info = n.split(" ");
            country[i] = info[0];
        }
        Arrays.sort(country);
        String cname = country[0];
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (cname.equals(country[i])) {
                count++;
            } else {
                System.out.println(cname + " " + count);
                cname = country[i];
                count = 1;
            }
        }
        System.out.println(cname + " " + count);
    }
}	
