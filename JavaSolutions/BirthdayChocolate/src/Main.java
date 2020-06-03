import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] s=new int[n];
        for(int i=0;i<n;i++){
            s[i]=scan.nextInt();
        }
        int d=scan.nextInt();
        int m=scan.nextInt();
        System.out.println(birthday(s,d,m));
    }
    public static int birthday(int[] s,int d,int m){
        int count=0;
        int j=m;
        for(int i=0;i<=(s.length-m);i++){
            int[] subs=new int[m];
            int sum=0;
            subs= Arrays.copyOfRange(s,i,j);
            for(int g:subs){
                sum+=g;
            }
            if(sum==d){
                count++;
            }
            j++;
        }
        return count;
    }
}
