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
    }
}