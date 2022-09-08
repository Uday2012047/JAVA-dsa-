public class recursion_9 {
    public static boolean[]map=new boolean[26];

    public static  void remove(String s,int i,String newS){
        if(i==s.length()){
            System.out.println(newS);
            return;
        }
        char currChar=s.charAt(i);
        if(map[currChar-'a']){
            remove(s,i+1,newS);
        }
        else {
            newS+=currChar;
            map[currChar-'a']=true;
            remove(s,i+1,newS);
        }
    }
    public static void main(String args[]){
        String s="abcdefghijklmnopqrstuvwxyzbbaaddhhyyjjkttiidnkorugbnjhffjdbfig";
        remove(s,0,"");
    }
}
