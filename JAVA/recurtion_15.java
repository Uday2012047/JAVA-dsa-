import java.util.Scanner;

public class recurtion_15 {
public static int callfriend(int n){
    if(n<=1){
        return 1;
    }
    int way1=callfriend(n-1);
    int way2=(n-1)*callfriend(n-2);
    return way1+way2;
}
public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n=");
    int n=sc.nextInt();

    System.out.println(callfriend(n));
}
}
