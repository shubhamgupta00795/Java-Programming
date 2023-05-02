import java.util.*;
class copyArray{
    static int[] sampleSpace(int[] arr, int sum){
        int[] sumArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sumArr[i] = 5+arr[i];
        }        
        return sumArr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = 5;
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            System.out.print(sampleSpace(arr, num)[i]+" ");
        }       
    }
}