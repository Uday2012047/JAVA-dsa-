//...................linear search(1D array).................
import java .util.*;
public class Array_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size=sc.nextInt();
        int number[]=new int[size];

      //for input
      for (int i=0;i<size;i++){
          System.out.println("Enter your numbers:");
          number[i]=sc.nextInt();
      }
        System.out.println("Enter your's number to search:");
      int x=sc.nextInt();
      // for output

      for (int i=0;i<size;i++){
   if(number[i]==x){
       System.out.println("No found at index:"+i);
   }
           // System.out.println(number[i]);

    }
        //System.out.println();

}}
