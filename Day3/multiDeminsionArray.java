class multiDeminsionArray{
    public static void main(String[] args){
        int[][] A= 
        {{1, 2, 3}, 
      {4, 5, 6}, 
      {7, 8, 9}};
        int[][] B= 
        {{9, 8, 7}, 
      {6, 5, 4}, 
      {3, 2, 1}};
        int[][] C=new int[A.length][B[0].length];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                C[i][j] = A[i][j]-B[i][j];
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.print("I am a good");
    }
}