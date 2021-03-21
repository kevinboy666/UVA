import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases=Integer.parseInt(sc.nextLine());             //cases
        int a[]=new int[cases];
        int b[]=new int[cases];
        for(int i=0; i<cases; i++) {
            a[i] = Integer.parseInt(sc.nextLine(), 2);
            b[i] = Integer.parseInt(sc.nextLine(), 2);
        }
        for(int i=0; i<cases; i++){
            System.out.print("Pair #"+(i+1)+": ");
            if(gcd(a[i], b[i])>1)
                System.out.println("All you need is love!");
            else
                System.out.println("Love is not all you need!");
        }
    }
    static int gcd(int x, int y){
        while(x>=1 && y>=1) {
            x %= y;
            if(x>0)
                y %= x;
        }
        return x+y;
    }
}
