import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int i=0; i<cases; i++){
            int address[]=new int[sc.nextInt()];
            for(int j=0; j<address.length; j++){
                address[j]=sc.nextInt();
            }
            Arrays.sort(address);
            int dis=0;
            for(int j=0; j<address.length; j++){
                dis+=Math.abs(address[j]-address[j/2]);
            }
            System.out.println(dis);
        }
    }
}

