/*..move all x to the end of string..*/
import java.util.*;
public class recursion_8 {
  public static void moveall(String s,int i,int count,String newString){
      if(i==s.length()){
          for (int j=0;j<count;j++){
              newString+='x';
          }
        System.out.println(newString);
          return;
      }
      char currChar=s.charAt(i);
      if(currChar=='x'){
          count++;
          moveall(s,i+1,count,newString);
      }
      else {
          newString+=currChar;
          moveall(s,i+1,count,newString);
      }
  }
  public static void main(String args[]){
      String s="axbdkxxbhexmxkk";
      moveall(s,0,0,"");
  }
}
