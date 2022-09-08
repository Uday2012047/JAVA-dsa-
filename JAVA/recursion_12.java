/*   print all permutation of a string   */
public class recursion_12 {

    public static void printpm(String s,String permutation){
        if(s.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<s.length();i++) {
            char currChar = s.charAt(i);
            String newS=s.substring(0,i)+s.substring(i+1);
            printpm(newS,permutation+currChar);
        }
    }
    public  static void main(String args[]){
        String s="abc";
        printpm(s,"");
    }
}
