import java.util.*;
class product{
    static int ProdInt(int[] arr){
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod *= arr[i];
        }
        return prod;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(ProdInt(arr));
    }
}