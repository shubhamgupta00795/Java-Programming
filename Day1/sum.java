import java.util.*;
class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int sumInt=0;
        for(int i=0;i<num;i++){
            sumInt += arr[i];
        }
        System.out.print(sumInt);
    }
}