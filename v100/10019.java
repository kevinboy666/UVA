import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int cases=sc.nextInt();
            sc.nextLine();
            for(int i=0; i<cases; i++){
                String num=sc.nextLine();
                int d=Integer.parseInt(num);
                int h=Integer.parseInt(num, 16);
                String b1="", b2="";
                while(d>0){
                    b1+=d%2;
                    d=d/2;
                }
                while(h>0){
                    b2+=h%2;
                    h=h/2;
                }
                System.out.println(b1.replace("0","").length()+" "+b2.replace("0","").length());
            }
        }
    }
}
