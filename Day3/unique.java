import java.util.*;
class unique{
    // public int solve(ArrayList<Integer> A) {
    // }
    public static void main(String[] args){
       ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(3); 
        arr.add(5); 
        arr.add(2); 
        arr.add(3); 
        arr.add(5); 
        arr.add(1); 
        arr.add(4);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(arr.get(i)==arr.get(j)){
                    continue;
                }else{
                    System.out.print(arr.get(j));
                }
            }
            System.out.println();
        }
    }
}