import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        long sum=aVeryLargeSum(a);
        System.out.println(sum);
    }
    public static long aVeryLargeSum( int[] b){
        long sum1=0;
        for (int i=0;i<b.length;i++){
            sum1+=b[i];
        }
        return sum1;
    }
}
