public class recursion_14 {
    public static int placetiles( int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horiplace=placetiles(n-m,m);
        int verplace=placetiles(n-1,m);
        return horiplace+verplace;
    }
    public static void main(String args[]){
        int n=8  ,m=6;
        int total=placetiles(n,m);
        System.out.println(total);
    }
}
