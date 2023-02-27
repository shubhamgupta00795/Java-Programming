class puzzelProblem{
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        int mul =1;
        for(int i=0;i<A.length;i++){
            mul *= A[i];
        }
        int[] newSample=new int[A.length];
        for(int i=0;i<A.length;i++){
            newSample[i] = mul/A[i];
        }
        for(int i=0;i<A.length;i++){
            System.out.println(newSample[i]);
        }
    }
}