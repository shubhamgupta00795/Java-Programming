import java.util.*;
class frequency{
    static int sample(ArrayList<Integer> arr, int a){
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==a){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(1);
        arr.add(12);
        arr.add(18);
        arr.add(40);
        arr.add(60);
        System.out.print(sample(arr, 10));
    }
}