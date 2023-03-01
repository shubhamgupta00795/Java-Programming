import java.lang.*;
class strings{
    public static void main(String[] args){
        String s1 = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        char[] arr = s1.toCharArray();
        int spfCount=0;
        for(int i=0;i<s1.length();i++){
            // System.out.println(arr[i]=='G');
            if(s1.charAt(i)=='G'){
                spfCount++;
            }

        }
        System.out.print(spfCount);
    }
}