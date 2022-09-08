/*keypad combination print*/
public class reqursion_11 {
    public static String[]keypd={".","abc","def","ghi","jkl","mno","p qrs","tu","vux","yz"};

    public static void keypad( String s,int i,String combination){
        if (i==s.length()){
            System.out.println(combination);
            return;
        }

        char curChar=s.charAt(i);
        String mapping=keypd[curChar-'0'];

        for (int j=0;j<mapping.length();j++){
            keypad(s,i+1,combination+mapping.charAt(j));
        }
    }
    public static void main(String args[]){
        String s="23";
        keypad(s,0,"");
    }
}
