import java.util.*;
class absolute{
    public static void main(String[] args){
        // int[] arr = new int[]{1,2,3,4,5,6,7,2};
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int arrLen=sc.nextInt();
            int[] arr = new int[arrLen];
            for(int j=0;j<arrLen;j++){
                arr[j] = sc.nextInt();
            }
            int even=0,odd=0;
            for(int k=0;k<arr.length;k++){
                if(arr[k]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            System.out.print(even-odd);
        }
        
    }
}