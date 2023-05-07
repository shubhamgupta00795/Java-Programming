import java.util.*;
class hashOne{
    public static void main(String[] args){
        HashMap<String,Integer> arr = new HashMap<>();
        System.out.println(arr);
        arr.put("key1",1);
        arr.put("key2",2);
        arr.put("key3",3);
        arr.put("key4",4);
        arr.put("key5",5);
        arr.put("key6",6);
        arr.put("key7",7);
        System.out.println(arr);
        arr.put("key2",7);
        System.out.println(arr.get("key2"));
        System.out.println(arr.containsKey("key2"));
        System.out.println(arr.size());
    }
}