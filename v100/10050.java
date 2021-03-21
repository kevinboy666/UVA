import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases=sc.nextInt();             //cases
        for(int c=0; c<cases; c++){
            int day=sc.nextInt();
            int group[]=new int[sc.nextInt()];
            Set<Integer> lost=new HashSet();
            for(int g=0; g<group.length; g++){
                group[g]=sc.nextInt();
            }
            for(int g=0; g<group.length; g++){
                int temp=group[g];
                while(temp<=day) {
                    if ((temp + 1) % 7 != 0 && temp % 7 != 0)
                        lost.add(temp);
                    temp += group[g];
                }
            }
            System.out.println(lost.size());
        }
    }
}
