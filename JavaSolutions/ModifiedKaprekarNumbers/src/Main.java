import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long p=s.nextLong();
        long q=s.nextLong();
        int count=0;
        for(long i=p;i<=q;i++){
            long digits=String.valueOf(i).length();
            int g=1;
            for(int j=1;j<=digits;j++){
                g*=10;
            }
            long square=i*i;
            long r1=square%g;
            long l1=square/g;
            int r=(int) r1;
            int l=(int) l1;
            if((r+l)==i){
                count+=1;
                System.out.print(i+" ");
            }
        }
        if(count==0){
            System.out.println("INVALID RANGE");
        }
    }
}
