class twoDArray{
    public static void main(String[] args){
        int[][] A={
            {353354984, 53094165},
          };
          long[] B=new long[A.length];
            for(int i=0;i<A.length;i++){
                int min = A[0][0];
                for(int j=0;j<A[0].length;j++){
                    if(min<A[i][j]){
                        System.out.print(min);
                        min=A[i][j];
                        B[i]=A[i][j];
                    }else{
                        B[i]=min;
                    }
                }
            }
            for(int i=0;i<B.length;i++){
                System.out.println(i+" -> "+B[i]);
            }
            // System.out.print(353354984 < 53094165);
    }
}