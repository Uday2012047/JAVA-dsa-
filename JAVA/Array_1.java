import java.util.*;
public class Array_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int marks[]=new int[n];
       // marks[0]=23;
        //marks[1]=44;
      //  marks[2]=56;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        //for input
        for (int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }

        //for output
        for (int i=0;i<n;i++){
           System.out.println(marks[i]);


        }

    }
}
