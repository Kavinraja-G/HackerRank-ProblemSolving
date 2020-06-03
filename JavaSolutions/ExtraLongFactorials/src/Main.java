import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        BigInteger g= BigInteger.valueOf(n);
        for(int i=(n-1);i>=1;i--){
            g=g.multiply(BigInteger.valueOf(i));
        }
        System.out.println(g);
    }
}
