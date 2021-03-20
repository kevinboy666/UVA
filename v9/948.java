import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr=new ArrayList();
        int f1=1,f2=2,f3=0;
        arr.add(f1);
        arr.add(f2);
        while(f3<100000000){
            f3=f1+f2;
            arr.add(f3);
            f1=f2;
            f2=f3;
        }
        while (sc.hasNext()) {
            int cases = sc.nextInt();
            for(int i=0; i<cases; i++){
                int num=sc.nextInt();
                int o=num;
                String fib="";
                for(int j=arr.size()-1; j>=0; j--){
                    if(num>=arr.get(j)){
                        fib+=1;
                        num-=arr.get(j);
                    }
                    else
                        fib+=0;
                }
                fib=fib.substring(fib.indexOf("1"));
                System.out.println(o+" = "+fib+" (fib)");
            }
        }
    }
}
