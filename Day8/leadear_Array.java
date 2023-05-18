import java.util.*;
class leadear_Array{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(13);
        list.add(18);
        list.add(11);
        list.add(19);
        list.add(12);
        System.out.print(list);
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)<list.get(i)){
                list2.add(list.get(i));
            }
        }
        System.out.print(list2);
    }
}