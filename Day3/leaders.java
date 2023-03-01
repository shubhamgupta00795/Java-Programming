class leaders{
    public static void main(String[] args){
        int[] arr = {93, 57, 83, 41, 100, 10, 79, 27, 94, 22, 4, 96, 48, 18, 89, 37, 21, 5, 46, 81, 15, 30, 47, 23, 34, 65, 55, 9, 36, 20, 54, 17, 7, 56, 78, 84, 87, 97, 16, 69, 28, 11, 44, 49, 8, 25, 98, 75, 53, 62, 19, 24, 80, 68, 50, 91, 1, 86, 77, 14, 72, 66, 42, 63, 73, 45, 31, 61, 85, 64, 35, 32, 92, 71, 74, 3, 99, 52, 90, 43, 6, 40, 38, 2, 12, 59, 29, 82, 76, 60, 67, 13, 70, 58, 39, 33, 95, 88, 51, 26};
        int count=1;
        int sufValue=arr[arr.length-1];
        int[] strStart=new int[arr.length];
        strStart[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>sufValue){
                sufValue=arr[i];
                strStart[i] = arr[i];
                count++;
            }else{
                strStart[i] = sufValue;
            }
        }
        // for(int i=0;i<strStart.length;i++){
        //     System.out.print(strStart[i]+" ");
        // }
        int[] arrCount = new int[count];
        int countAr=0;
        arrCount[countAr]=strStart[0];
        for(int i=1;i<strStart.length;i++){
            if(strStart[i]<strStart[i-1]){
                countAr++;
                arrCount[countAr]=strStart[i];
            }
        }
        for(int i=0;i<arrCount.length;i++){
            System.out.print(arrCount[i]+"  ");
        }

    }
}