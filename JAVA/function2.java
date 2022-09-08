import java.util.*;
public class function2 {
    public static int multiple(int a,int b){
        int c=a*b;
        System.out.println(c);
        return c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        multiple(a,b);
    }
}
