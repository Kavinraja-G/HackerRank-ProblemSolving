import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] customer=new int[k];
        Integer[] f=new Integer[n];
        for(int i=0;i<n;i++){
            f[i]=s.nextInt();
        }
        Arrays.sort(f, Collections.reverseOrder());
        int cost=0;
        for(int i=0;i<n;i++){
            int x=i%k;
            cost+=(customer[x]+1)*f[i];
            customer[x]+=1;
        }
        System.out.println(cost);
    }
}
