/*IMPORTENT..*/
//print all subsequences of string
public class recursion_10 {
     public static void subseq(String s,int i,String newS){
         if(i==s.length()){
             System.out.println(newS);
             return;
         }
         char currChar=s.charAt(i);

         subseq(s,i+1,newS+currChar);
         subseq(s,i+1,newS);
     }
     public  static void main(String args[]){
         String s="abc ";
         subseq(s,0,"");
     }
}
