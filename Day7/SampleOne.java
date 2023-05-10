import java.util.*;
class SampleOne{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(1);
        System.out.print(arr);
        HashMap<Integer, Integer> sample=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(sample.containsKey(arr.get(i))){
                int value=sample.get(arr.get(i));
                value++;
                sample.put(arr.get(i), value);
            }else{
                sample.put(arr.get(i), 1);
            }
        }
        // for(Map.Entry<Integer,Integer> e: sample.entrySet()){
        //     if(e.getValue()==1){

        //     }
        // }
        for(int key: sample.keySet()){
            System.out.println(key);
        }
        // System.out.print(sample.keySet());
    }
}