import java.util.*;
class Negative{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int count=0;
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                count++;
            }
        }
        int[] negArr=new int[count];
        for(int i=0;i<num;i++){
            int sample=0;
            if(arr[i]<0){
                negArr[sample]=arr[i];
                System.out.print(negArr[sample]+" ");
                sample++;
         }   
        }
    }
}