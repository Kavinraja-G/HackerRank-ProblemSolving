import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        String ans="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(i)){
                ans+="0";
            }else{
                ans+="1";
            }
        }
        System.out.println(ans);
    }
}
