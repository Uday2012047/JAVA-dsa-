import java.util.*;
public class Linked_list {
     public static void main(String args[]){
            LinkedList<String>list=new LinkedList<String>();
         list.addFirst("am");
         list.addFirst("I");
         list.addLast("Uday");
         System.out.println(list);
         System.out.println(list.size());
         for(int i=0;i< list.size();i++){
             System.out.print(list.get(i)+"-->");
         }
         System.out.println("null");
        // list.remove(1);
         //System.out.println(list);
         //list.removeLast();
         //System.out.println(list);
         System.out.println(list.get(0)+list.get(1)+list.get(list.size()-1));
        }
    }

