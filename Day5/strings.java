import java.util.*;
class strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int lengths=sc.nextInt();
        for(int i=0;i<lengths;i++){
            String str = sc.next();
            System.out.println(str.length());
        }
    }
}