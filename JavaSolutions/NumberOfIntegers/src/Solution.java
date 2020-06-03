import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
class Solution
{
    static final int M = 20;
    static int dp[][][]= new int[M][M][2];
    static int K;
    static Vector<Integer> num;
    static int countInRangeUtil(int pos, int cnt, int tight )
    {
        if (pos == num.size()) {
            if (cnt <= K)
                return 1;
            return 0;
        }
        if (dp[pos][cnt][tight] != -1)
            return dp[pos][cnt][tight];

        int ans = 0;
        int limit = (tight!=0 ? 9 : num.get(pos));

        for (int dig = 0; dig <= limit; dig++) {
            int currCnt = cnt;

            // If the current digit is nonzero
            // increment currCnt
            if (dig != 0)
                currCnt++;

            int currTight = tight;

            // At this position, number becomes
            // smaller
            if (dig < num.get(pos))
                currTight = 1;

            // Next recursive call
            ans += countInRangeUtil(pos + 1, currCnt, currTight);
        }
        return dp[pos][cnt][tight] = ans;
    }
    static int countInRange(int x)
    {
        num= new Vector<Integer>();
        while (x!=0) {
            num.add(x % 10);
            x /= 10;
        }
        Collections.reverse(num);
        for(int i=0;i<M;i++)
            for(int j=0;j<M;j++)
                for(int k=0;k<2;k++)
                    dp[i][j][k]=-1;
        return countInRangeUtil(0, 0, 0);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int L =  s.nextInt(), R = s.nextInt();
        K = s.nextInt();
        System.out.println( countInRange(R) - countInRange(L - 1) );
    }
}

