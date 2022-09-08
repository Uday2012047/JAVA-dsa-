import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String args[]){
        HashSet<Integer>set=new HashSet<>();


        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(10);
        System.out.println(set);
        //search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("delet 1");
        }
        //size
        System.out.println(set.size());

      //iterator
        Iterator it=set.iterator();
        //hashNext() & next() fun
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
