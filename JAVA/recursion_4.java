/*.....print x^n.......*/
import java.util.*;
public class recursion_4 {
    public static int calpow(int x,int n){
  if(n==0){
      return 1;
  }
  if(x==0){
      return 0;
  }
        int xpow1=calpow(x,n-1);
        int xpow2=x*xpow1;
        return xpow2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n= sc.nextInt();
        int ans=calpow(x,n);
        System.out.println(ans);
    }
}
