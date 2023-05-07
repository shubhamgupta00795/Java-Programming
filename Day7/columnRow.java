import java.util.*;

class columnRow{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> arrA=new ArrayList<>();
        ArrayList<Integer> arrB=new ArrayList<>();
        ArrayList<Integer> arrC=new ArrayList<>();
        arrA.add(1);
        arrA.add(2);
        arrB.add(3);
        arrB.add(4);
        arrC.add(5);
        arrC.add(6);
        arr.add(arrA);
        arr.add(arrB);
        arr.add(arrC);
        System.out.print(arr);

        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            int sum = 0;
            for(int j=0;j<arr.get(i).size();j++){
                sum += arr.get(i).get(j);
            }
            arrList.add(sum);
        }
        
        for(int i=0;i<arr.get(0).size();i++){
            int sum=0;
            for(int j=0;j<arr.size();j++){
                sum += arr.get(j).get(i);
            }
            arrList.add(sum);
        }
        System.out.print(arrList);
    }
}