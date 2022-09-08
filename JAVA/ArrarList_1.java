import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;

public class ArrarList_1 {
    public static void main(String args[]) {


        ArrayList<Integer> list = new ArrayList<Integer>();

        //add element
        list.add(12);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //get element
        int element= list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,13);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //arratylist size
        int size= list.size();
        System.out.println(size);

        //loops
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}