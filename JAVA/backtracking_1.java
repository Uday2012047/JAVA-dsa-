public class backtracking_1 {
   public static void permutation(String str,String per,int idx){
  if(str.length()==0){
      System.out.println(per);
      return;
  }
       for(int i=0;i<str.length();i++){
           char currchar=str.charAt(i);
           String newstr=str.substring(0,i)+str.substring(i+1);
           permutation(newstr,per+currchar,i+1);
       }
   }
   public static void main(String args[]){
       String str="ABC";
       permutation(str,"",0);
   }
}
//T.C=O(n*n!) 