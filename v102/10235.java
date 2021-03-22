import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            boolean p=prime(num);
            boolean e=true;
            if(p)
                e=emirp(num);
            if(p) {
                if(e)
                    System.out.println(num+" is emirp.");
                else
                    System.out.println(num+" is prime.");
            }
            else
                System.out.println(num+" is not prime.");
        }
    }

    static boolean prime(int num){
        int count=0;
        boolean prime=true;
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num%i==0)
                count++;
        }
        if(count==1)
            return true;
        return false;
    }
    static boolean emirp(int num){
        String[] str=Integer.toString(num).split("");
        int n= str.length;
        String temp="";
        for(int i=0; i<n/2; i++){
            temp=str[i];
            str[i]=str[n-i-1];
            str[n-i-1]=temp;
        }
        int rnum=Integer.parseInt(String.join("", str));
        if(num==rnum)
            return false;
        return prime(rnum);
    }
}
