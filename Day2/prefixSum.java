class prefixSum{
    static void prefix(int[] A, int[][] B){
        int[] pf=new int[A.length];
        pf[0] = A[0];
        for(int i=1;i<A.length;i++){
            pf[i]=pf[i-1]+A[i];
        }
        for(int i=0;i<B.length;i++){
            int lf = B[i][0];
            int rf = B[i][1];
            if(lf==0){
                System.out.println(pf[lf]);
            }
            else{
                int ref = pf[rf]-pf[lf-1];
                System.out.println(ref);     
            }
        }
    }
 public static void main(String[] args){
    int[] arr = {2,5,3,6,2,8};
    int[][] brr = {{0,3}, {0,2}, {3,5}, {1,3}};
    prefix(arr, brr);
 }
}