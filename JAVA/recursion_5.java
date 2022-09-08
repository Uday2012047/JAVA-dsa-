/*......String Reverse.....*/
import java.util.*;
public class recursion_5 {
    public static void stringrev(String s,int i){
        if(i==0){
            System.out.print(s.charAt(i));
            return ;
        }
        System.out.print(s.charAt(i));
        stringrev(s,i-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();

      stringrev(s, s.length() - 1);
    }

}
