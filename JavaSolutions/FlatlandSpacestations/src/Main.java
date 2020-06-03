import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=s.nextInt();
        }
        ArrayList<Integer> val=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(Arrays.asList(a).contains(i)){
                val.add(i);
            }else{
                int d=calcDist(n,a,i);
                val.add(d);
            }
        }
        System.out.println(Collections.max(val));
    }
    static int calcDist(int n, int[] c, int value)
    {
        int min = Integer.MAX_VALUE;
        for(int space : c)
        {
            if(Math.abs(value-space)<min)
                min = Math.abs(value-space);
        }
        return min;
    }
}
