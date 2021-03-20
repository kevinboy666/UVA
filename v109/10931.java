import java.util.*;

public class Main {
    static String b="";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num=sc.nextInt();
            b="";
            if(num!=0) {
                binary(num);
                System.out.println("The parity of " + b + " is " + b.replace("0", "").length() + " (mod 2).");
            }
        }
    }
    static String binary(int n){
        if(n>1)
            binary(n/2);
        return b+=n%2;
    }
}
