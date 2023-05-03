import java.util.*;
class search{
    static int findSearch(int[] arr, int ele){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==ele){
               return 1;
           }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int arrLength=sc.nextInt();
            int[] arr=new int[arrLength];
            for(int j=0;j<arrLength;j++){
                arr[j]=sc.nextInt();
            }
            int findNum=sc.nextInt();
            System.out.print(findSearch(arr, findNum));
        }
    }
}