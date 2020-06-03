import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test =  s.nextInt();
        while (test-- >0) {
            int n = s.nextInt();
            int[] b = new int[n];
            int[] g = new int[n];
            for (int i = 0; i < n; i++)
                b[i] = s.nextInt();
            for (int i = 0; i < n; i++)
                g[i] = s.nextInt();

            String result = "YES";
            int x = 0;
            if(Arrays.equals(b,g))
            {
                System.out.println("YES");
                continue;
            }
            else {
                Arrays.sort(b);
                Arrays.sort(g);
            while(b[x]==g[x])
            {
                x++;
            }
            for (int i = 0; i < n - 1; i+=2)
            {
                if(b[x]<=g[x])
                {
                    if(b[i]>g[i] || g[i]>b[i+1] || g[i+1]<b[i+1])
                    {
                        result = "NO";
                        break;
                    }
                }
                else if(g[x]<=b[x])
                {
                    if(g[i]>b[i] || b[i]>g[i+1] || b[i+1]<g[i+1])
                    {
                        result = "NO";
                        break;
                    }
                }
            }
            System.out.println(result);
            }
        }
    }
}
