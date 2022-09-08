/*..array is sorting or not..*/
import java.util.*;
public class recurtion_7 {
    public  static boolean isSorted(int a[],int i){
      if(i==a.length-1){
          return true;
      }
        if(a[i]<a[i+1]){
              return isSorted(a,i+1);
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        int a[]={1,2,3,3};
        System.out.println(isSorted(a,0));
    }
}
