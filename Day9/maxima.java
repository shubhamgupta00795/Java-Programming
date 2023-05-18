class maxima{
    public static void main(String[] args){
        int[] arr=new int[]{-533,-666,-500,169,724,478,358,-38,-536,705,-855,281,-173,961,-509,-5,942,-173,436,-609,-396,902,-847,-708,-618,421,-284,718,895,447,726,-229,538,869,912,667,-701,35,894,-297,811,322,-667,673,-336,141,711,-747,-132,547,644,-338,-243,-963,-141,-277,741,529,-222,-684,35};
        int maxOne=0; 
        int maxTwo=0;
        int maxThree=0;
        for(int i=0;i<48;i++){
            maxOne += arr[i];
        }
        for(int i=arr.length-1;i>arr.length-49;i--){
            maxTwo += arr[i];
        }
        maxThree=arr[0];
        for(int i=arr.length-1;i>arr.length-49;i--){
            maxThree += arr[i];
        }
        System.out.println(maxOne+" "+maxTwo+" "+maxThree);
        if(maxOne>maxTwo && maxOne>maxThree ){
            System.out.print(maxOne);
        }else if(maxTwo>maxOne && maxTwo>maxThree ){
            System.out.print(maxTwo);
        }else{
            System.out.print(maxThree);
        }
    }
}