import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n=scan.nextInt();
        int q=n/s.length();
        int r=n%s.length();
        String s1=s.repeat(q);
        String s2=s.substring(0,r);
        String S=s1+s2;
        int count=0;
        for(char i:S.toCharArray()){
            if(i=='a'){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
