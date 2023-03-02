class ArrayRotation{
    static int[] sampleArr(int[] a,int b,int c){
        int si=b;
        int ei=c;
        while(si<ei){
            int temp = a[si];
            a[si]=a[ei];
            a[ei]=temp;
            si++;
            ei--;
        }
        return a;
    } 
    public static void main(String[] args){
        int[] arr = {7, 4, 2, 10, 5 };
        int[] sample = sampleArr(arr,0,arr.length-1);
        sampleArr(arr,0,2);
        sampleArr(arr,2,arr.length-1);

        for(int i=0;i<sample.length;i++){
            System.out.println("Array of the area : "+sample[i]);
        }
    }
}