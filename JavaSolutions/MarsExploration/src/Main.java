import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char[] c1={'S','O','S'};
        int count=0;
        for(int i=0;i<str.length();i+=3){
            String str2=str.substring(i,i+3);
            char[] c=str2.toCharArray();
            for(int j=0;j<3;j++){
                if(c[j]!=c1[j]){
                    count+=1;
                }
            }
        }
        System.out.println(count);

    }
}
