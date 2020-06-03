import java.io.*;
import java.util.*;

public class main {
    // Complete the flatlandSpaceStations function below.
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

    static int flatlandSpaceStations(int n, int[] c) {
        ArrayList<Integer> op = new ArrayList<Integer>();
        if(n == c.length) return 0;
        else
        {
            for(int i=0;i<n;i++)
            {
                if(Arrays.asList(c).contains(i)) op.add(0);
                else{
                    int distance = calcDist(n,c,i);
                    op.add(distance);
                }
            }
            int max = Collections.max(op);
            return max;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
