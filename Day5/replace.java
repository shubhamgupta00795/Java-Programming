import java.util.*;
class replace{
    public static String sample(String strs){
        char one=strs.charAt(0);
        String onceStr = "";
        onceStr += strs.charAt(0);
        for(int i=1;i<strs.length();i++){
            if(strs.charAt(i)==one){
                onceStr += "$";
            }else{
                onceStr += strs.charAt(i);
            }
        }
        return onceStr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(sample(str));
    }
}