class sumOddEven{
    public static void main(String[] args){
        int[] arr=new int[]{56,63,87,24,32,13,15,19,44,52};
        int even =0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even += arr[i];
            }else{
                odd += arr[i];
            }
        }
        System.out.print(even-odd);
    }
}