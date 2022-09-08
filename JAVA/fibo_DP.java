import java.util.Scanner;

public class fibo_DP {
    public static int fibo(int n,int qb[]){
        if(n==0||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int fibo1=fibo(n-1,qb);
        int fibo2=fibo(n-2,qb);
        int fibototal=fibo1+fibo2;
        qb[n]=fibototal;
        return fibototal;
    }
    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fibn=fibo(n,new int[n+1]);


        System.out.println(fibn);
    }
}
