
import java.util.*;
public class Main{
	public static void main(String agrv[]) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while (sc.hasNextLong()) {
			count++;
			System.out.printf("%4d.", count);
			long num = sc.nextLong();
			if(num==0) {
				System.out.print(" "+num+"\n");
				continue;
			}
			Bangla(num);
			System.out.print("\n");
		}
	}
	public static void Bangla(long num) {		
		if (num >= 10000000) {
			Bangla(num/10000000);
			System.out.print(" kuti");
			num = num % 10000000;
		}
		if (num >= 100000) {
			Bangla(num/100000);
			System.out.print(" lakh");
			num = num % 100000;
		}
		if (num >= 1000) {
			Bangla(num/1000);
			System.out.print(" hajar");
			num = num % 1000;
		}
		if (num >= 100) {
			Bangla(num/100);
			System.out.print(" shata");
			num=num%100;
			if(num!=0)
			System.out.print(" "+num);
		}	
		else if(num!=0)
			System.out.print(" "+num);
	}
}