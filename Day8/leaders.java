class leaders{
    public static void main(String[] args){
        int[] arr=new int[]{2,5,6,8,9,8,7};
        int value=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                value++;
            }
            System.out.println(value+"<----------->");
        }
    }
}