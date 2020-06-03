import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            int k=s.nextInt();
            int[] arr=func(n,k);
            for(int j:arr) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
    public static int[] func(int n,int k){
        Set<Integer> set=new HashSet<>();
        int[] a=new int[n];
        int[] b={-1};
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(Math.abs(j-i)==k && set.add(j)==true){
                    set.add(j);
                    a[i-1]=j;
                    count+=1;
                    break;
                }
            }
        }
        if(count==n){
            return a;
        }else{
            return b;
        }

    }
}
