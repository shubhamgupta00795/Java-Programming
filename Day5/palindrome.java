import java.util.*;
class palindrom{
    public static boolean sample(String s){
        String revStr="";
        for(int i=s.length()-1;i>=0;i--){
            revStr += s.charAt(i);
        }
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == revStr.charAt(i)){
                flag = true;
            }else{
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
        System.out.print(sample(str));
    }
}