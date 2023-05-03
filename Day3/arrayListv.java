import java.util.*;
class arrayListV{
    public static ArrayList<Integer> sample(ArrayList<Integer> arr){
        ArrayList<Integer> arrL = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%5==0 && arr.get(i)%7==0){
                arrL.add(arr.get(i));
            }
        }
        return arrL;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        System.out.print(sample(arr));
    }
}