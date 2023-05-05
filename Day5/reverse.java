import java.util.*;
class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr += str.charAt(i);
        }
        System.out.print(revStr);
    }
}