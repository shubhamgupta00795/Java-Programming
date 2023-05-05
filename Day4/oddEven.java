import java.util.*;
class oddEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            int[] arr=new int[b];
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<b;j++){
                if(arr[j]%2==0){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
            for(int j=0;j<b;j++){
                if(arr[j]%2!=0){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}