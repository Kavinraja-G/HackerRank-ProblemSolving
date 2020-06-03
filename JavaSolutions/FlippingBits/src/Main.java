import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        long max=(long) Math.pow(2,32)-1;
        for(int i=1;i<=t;i++){
            long val=s.nextLong();
            System.out.println(max-val);
        }
    }
}
