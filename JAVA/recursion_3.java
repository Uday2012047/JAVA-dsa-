/*...fibonacci sequence...*/
import java.util.*;
public class recursion_3 {
    public static void fibo(int a,int b,int n){
        if(n==0){
            return;
        }
      int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a=0,b=1;
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        fibo(a,b,n-2);
    }
}
