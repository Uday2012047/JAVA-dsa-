/*.........print factorial of number n......*/
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Recursion_2 {
    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
          int f1=factorial(n-1);
          int f2=n*f1;
          return f2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int total=factorial(n);
        System.out.println(total);
    }


}
