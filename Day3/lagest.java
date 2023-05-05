import java.util.*;
class largest{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        arr1.add(52);
        arr1.add(64);
        arr1.add(269);
        arr2.add(277);
        arr2.add(369);
        arr2.add(295);
        arr3.add(358);
        arr3.add(38);
        arr3.add(507);
        arr3.add(653);
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);

        ArrayList<Integer> maxList=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            int max=arr.get(i).get(0);
            for(int j=0;j<arr.get(i).size();j++){
                if(max<arr.get(i).get(j)){
                    max=arr.get(i).get(j);
                }
            }
            maxList.add(max);
        }
        System.out.print(maxList);
    }
}