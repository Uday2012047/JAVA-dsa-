import java.util.Scanner;

public class dp_2 {
    public static int countpath(int n,int qb[]){

        if(n==0){
            return 1;
        } else if (n<0) {
            return 0;
        }
    if(qb[n]!=0){
        return qb[n];
    }
        int count1=countpath(n-1,qb);
        int count2=countpath(n-2,qb);
        int count3=countpath(n-3,qb);
        int totalpath=count1+count2+count3;

        qb[n]=totalpath;
        return  totalpath;
    }
    public static int cpTablelation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
              dp[i]=dp[i-1];
            } else if (i==2) {
                  dp[i]=dp[i-1]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }

        }
       return dp[n];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      //  System.out.println(countpath(n,new int [n+1]));

        System.out.println(cpTablelation(n));
    }
}
