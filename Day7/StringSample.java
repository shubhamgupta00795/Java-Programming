import java.util.*;
class stringSample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int vowels=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)== 'e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowels++;
            }
        }
        int consonents=str.length()-vowels;
        System.out.print(vowels+"<------>"+consonents);
    }
}