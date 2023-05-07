import java.util.*;
class frequency{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,5,7,2,3,7,4,3,5};
        HashMap<Integer, Integer> sets = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sets.put(i,arr[i]);
        }
        System.out.print(sets);
    }
}