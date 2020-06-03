import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test-- >0)
        {
            int size = s.nextInt();
            int compareValue = s.nextInt();
            Integer[] a = new Integer[size];
            Integer[] b = new Integer[size];
            for (int i=0;i<size;i++)
            {
                a[i] = s.nextInt();
            }
            for (int i=0;i<size;i++)
            {
                b[i] = s.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b, Collections.reverseOrder());
            String result = "YES";
            for (int i=0;i<size;i++)
            {
                if(a[i]+b[i] != compareValue)
                {
                    result = "NO";
                }
            }
            System.out.println(result);
        }
    }
}
