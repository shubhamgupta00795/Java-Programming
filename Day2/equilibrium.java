class equilibrium{
    public static void main(String[] args){
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        int length=A.length;
        int[] lpf = new int[length];
        int[] rpf = new int[length];
        lpf[0]=0;
        rpf[length-1]=0;
        for(int i=1;i<length;i++){
            lpf[i]=lpf[i-1]+A[i-1];
        }
        for(int i=length-1;i>0;i--){
            rpf[i-1]=rpf[i]+A[i];
        }
        for(int i=0;i<length;i++){
            if(lpf[i]==rpf[i]){
                System.out.println(i);
            }
        }
    }
}