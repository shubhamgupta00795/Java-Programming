import java.util.*;
class twoDArray{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        
        arr1.add(52);
        arr1.add(64);
        arr1.add(269);
        arr2.add(277);
        arr2.add(369);
        arr2.add(295);
        arr3.add(358);
        arr3.add(507);
        arr3.add(653);

        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);
        System.out.println(arr);
        int row = arr.size();
        int column = arr.get(1).size();
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<column;j++){
                sum += arr.get(j).get(i);
            }
            newArr.add(sum);
        }
        System.out.println(newArr);
    }
}