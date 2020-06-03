import java.io.*;
import java.util.*;

public class solution {

    // Complete the triplets function below.
    static long triplets(int[] a, int[] b, int[] c) {
        a = Arrays.stream(a).sorted().distinct().toArray();
        b = Arrays.stream(b).sorted().distinct().toArray();
        c = Arrays.stream(c).sorted().distinct().toArray();
        long total = 0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]<a[0] || b[i]<c[0])
            {
                continue;
            }
            else
            {
                long countinA=0,countinC=0;
                for(int j=0;(j<a.length && a[j]<=b[i]);j++)
                {
                    countinA++;
                }
                for(int k=0;(k<c.length && c[k]<=b[i]);k++)
                {
                    countinC++;
                }
                total+= (countinA*countinC);
            }
        }
        return total;
    }

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int n1,n2,n3;
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();
        int[] arra = new int[n1];
        int[] arrb = new int[n2];
        int[] arrc = new int[n3];
        for(int i=0;i<n1;i++) {
            arra[i] = s.nextInt();
        }
        for(int i=0;i<n2;i++) {
            arrb[i] = s.nextInt();
        }
        for(int i=0;i<n3;i++) {
            arrc[i] = s.nextInt();
        }
        long ans = triplets(arra, arrb, arrc);
        System.out.println(ans);
    }
}
