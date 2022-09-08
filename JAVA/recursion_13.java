/*  Count total paths in maze to move from(0,0) to(n,m)....*/
public class recursion_13 {
       public static int countpath(int i, int j, int n,int m){
           if(i==n||j==m){
               return 0;
           }
           if(i==n-1&&j==m-1){
               return 1;
           }


           int downpath=countpath(i+1,j,n,m);
           int leftpath=countpath(i,j+1,n,m);
           return downpath+leftpath;
       }
       public static void main(String args[]){
           int n=5,m=7;
           int totalpath=countpath(0,0,n,m);
           System.out.println(totalpath);
       }
}
