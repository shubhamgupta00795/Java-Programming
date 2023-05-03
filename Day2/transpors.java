import java.util.*;
class transpors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arrA=sc.nextInt();
        int arrB=sc.nextInt();
        int[][] matrix=new int[arrA][arrB];
        for(int i=0;i<arrA;i++){
            for(int j=0;j<arrB;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<arrB;j++){
                for(int i=0;i<arrA;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}