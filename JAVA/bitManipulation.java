import java.util.Scanner;

public class bitManipulation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int position=sc.nextInt();//position not grater then the index-1
        int bitMask=1<<position;
        if ((bitMask & n)==0){
            System.out.println("Bit on the position  is :0");
        }
        else    System.out.println("Bit on the position  is :1");
    }
}
