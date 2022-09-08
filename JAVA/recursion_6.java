/*....1st & last occurence of an element in string...*/
//T.C==0(n)
import java.util.*;
public class recursion_6 {
  public static int first=-1;
  public static int last=-1;
  public static void index( String  s ,int i,char element) {
    if (i == s.length()) {
      System.out.println(first);
      System.err.println(last);
      return;
    }
    char currChar = s.charAt(i);
    if (currChar == element) {
      if (first == -1) {
        first = i;
      } else {
        last = i;
      }
    }
    index(s, i + 1, element);
  }
  public static void main(String args []){
   // Scanner sc=new Scanner(System.in);
    String s="abbfdeaah";
    index(s,0,'a');
  }

}
