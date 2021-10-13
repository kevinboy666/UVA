import java .util.*;
public class Main {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       while(sc.hasNextLine()){
           int num1=sc.nextInt();
           int num2=sc.nextInt();
           int x=0;
           int c=0;
           
           if(num1==0 && num2==0 )
                break;
           while(num1>0 || num2>0){
               x+=num1%10 + num2%10;
               num1=num1/10;
               num2=num2/10;
               if(x>9){
                    c++;
                    x=1;
               }
               else
                    x=0;        
           }
           if(c==0)
                System.out.println("No carry operation.");
            else if(c==1)
                 System.out.println("1 carry operation.");
            else if(c>1)
                 System.out.printf("%d carry operations.\n", c);
       }
   } 
}

