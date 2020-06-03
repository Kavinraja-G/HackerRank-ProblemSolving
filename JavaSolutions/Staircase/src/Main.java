import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        int j=(n-1);
        String s1=" ";
        String s2="#";
        while(i<=n){
            String repeated1=new String(new char[j]).replace("\0",s1);
            String repeated2=new String(new char[i]).replace("\0",s2);
            System.out.println(repeated1+repeated2);
            i++;
            j--;

        }

    }
}
