import java.util.Scanner;

class MaxMin{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int[] arr = new int[num];
    for(int i=0;i<num;i++){
      arr[i]=sc.nextInt();
    }
    int max=arr[0], min=arr[0];
    for(int i=0;i<num;i++){
      if(arr[i]>max){
         max=arr[i];
      }
      if(min>arr[i]){
         min=arr[i];
      }     
    }
    System.out.print(max+" "+min);
   } 
}
