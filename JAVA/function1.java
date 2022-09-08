import java.util.*;

public class function1 {
    public static int sum(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
    }
}
