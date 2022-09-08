import java.util.*;
public class stack_collection_framework {
    public static void pushAtbottom(int data, Stack<Integer>s){
       if(s.isEmpty()){
           s.push(data);
           return;
       }
        int top=s.pop();
        pushAtbottom(data, s);
        s.push(top);
    }
    public static void reverce(  Stack<Integer>s){
        if(s.isEmpty()){
            return ;
        }
        int top=s.pop();
        reverce(s);
        pushAtbottom(top,s);
    }
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(5);
        s.push(3);
        s.push(2);
        s.push(0);
     //  pushAtbottom(6, s);
        reverce(s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
    }
}
