import java.util.ArrayList;
import java.util.*;


public class recursion_16 {
    public static void print(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println(" ");
    }
    public static void findsubset(int n,ArrayList<Integer>subset){
        if(n==0){
          print(subset);
          return;
        }
        //add elsement
        subset.add(n);
        findsubset(n-1,subset);
        //not add
        subset.remove(subset.size()-1);
        findsubset(n-1,subset);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>subset=new ArrayList<>();
        findsubset(n,subset);

    }
}
