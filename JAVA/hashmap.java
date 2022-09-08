import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String args[]){
        HashMap<String,Integer>hMap=new HashMap<>();

        //insertion
        hMap.put("India",120);
        hMap.put("us",50);
        hMap.put("china",160);
        hMap.put("nepal",30);
        System.out.println(hMap);
        hMap.put("us",80);
        System.out.println(hMap);

        //search
        if(hMap.containsKey("ffss")){
            System.out.println("key present in the map");
        }else System.out.println("not present");

        System.out.println(hMap.get("us"));//key exist--give vlaue

        System.out.println(hMap.containsKey("kvhvxnv"));//not exist--false

        //iterate

        for(Map.Entry<String,Integer> e:hMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //remove pairs
        hMap.remove("china");
        System.out.println(hMap);

    }
}
