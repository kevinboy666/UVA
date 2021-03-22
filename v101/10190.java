import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a=sc.nextLong();
            long b=sc.nextLong();
            List<Long> list=new ArrayList();
            if(a>1 && b>1 && a>=b) {
                while (a % b == 0) {
                    list.add(a);
                    a /= b;
                }
                list.add(a);
                if (list.get(list.size() - 1) == 1) {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i));
                        if(i<list.size()-1)
                            System.out.print(" ");
                    }
                    System.out.println();
                } else
                    System.out.println("Boring!");
            }
            else
                System.out.println("Boring!");
        }
    }
}
