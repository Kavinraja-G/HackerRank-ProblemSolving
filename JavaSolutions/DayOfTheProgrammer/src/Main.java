import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int y=s.nextInt();
        System.out.println(dayOfProgrammer(y));
    }
    public static String dayOfProgrammer(int y){
        boolean isleapyear;
        if(y>1918){
            if(y%400==0 || (y%4==0 && y%100!=0)){
                isleapyear=true;
            }else{
                isleapyear=false;
            }
        }else if(y<1918){
            if(y%4==0){
                isleapyear=true;
            }else{
                isleapyear=false;
            }
        }else {
            String str ="26.09.1918";
            return str;
        }
        String str1;
        if(isleapyear==true){
            str1="12.09.";
        }else{
            str1="13.09.";
        }
        String str2=str1+y;
        return str2;

    }
}
