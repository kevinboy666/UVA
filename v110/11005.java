import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases=sc.nextInt();             //cases
        for(int c=1; c<=cases; c++){
            System.out.println("Case "+c+":");
            int[] cost=new int[36];
            for(int i=0; i<36; i++)
                cost[i]=sc.nextInt();

            int que=sc.nextInt();           //numbers
            for(int i=0; i<que; i++){
                int num=sc.nextInt();
                int[] total=new int[37];
                for(int base=2; base<=36; base++){
                    int num2=num;
                    while(num2>0){
                        int ch=num2%base;
                        num2=num2/base;
                        total[base]+=cost[ch];
                    }
                }
                int min=total[2];
                for(int k=3; k<=36; k++){
                    if(total[k]<min)
                        min=total[k];
                }
                System.out.print("Cheapest base(s) for number "+num+":");
                for(int k=2; k<=36; k++){
                    if(total[k]==min)
                        System.out.print(" "+k);
                }
                System.out.println();
            }
            if(c<cases)
                System.out.println();
        }
    }
}
