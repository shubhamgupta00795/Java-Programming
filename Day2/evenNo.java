class evenNo{
    static void evenNo(int[] A,int[][] B){
        int[] pf=new int[A.length];
        if(A[0]%2==0){
            pf[0]=1;
        }else{
            pf[0]=0;
        }
        for(int i=1;i<A.length;i++){
            if(A[i]%2==0){
                pf[i]=pf[i-1]+1;
            }else{
                pf[i]=pf[i-1];
            }
        }
        int[] sample=new int[B.length];
        for(int i=0;i<B.length;i++){
            int lf=B[i][0];
            int rf=B[i][1];
            if(lf==0){
                sample[i]=pf[rf];
            }else{
                sample[i]=pf[rf]-pf[lf-1];
            }
        }
        for(int i=0;i<sample.length;i++){
            System.out.println(sample[i]);
        }
    }
    public static void main(String[] args){
        int[] A ={1,2,4,5,3,6};
        int[][] B={{0,5},{2,4},{3,4},{1,5}};
        evenNo(A,B);
    }
}