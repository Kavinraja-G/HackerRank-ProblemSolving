import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        StringBuilder stringBuilder=new StringBuilder(str2);
        int count=0;
        for(char c:str1.toCharArray()){
            for(int i=0;i<stringBuilder.length();i++){
                if(c==stringBuilder.charAt(i)){
                    count+=1;
                    stringBuilder.deleteCharAt(i);
                    break;
                }
            }
        }
        int s1=str1.length()-count;
        int s2=str2.length()-count;
        System.out.println(s1+s2);
    }
}
