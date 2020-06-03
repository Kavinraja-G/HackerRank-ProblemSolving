import java.math.BigInteger;
import java.util.*;
class Solution
{
    static final long mod = (long) (Math.pow(10,9) + 7);
    static final long M = 20;
    static long dp[][][]= new long[(int) M][(int) M][2];
    static long K;
    static Vector<BigInteger> num;
    static long countInRangeUtil(long pos, long cnt, long tight )
    {
        if (pos == num.size()) {
            if (cnt == K)
                return 1;
            return 0;
        }
        if (dp[(int) pos][(int) cnt][(int) tight] != -1)
            return dp[(int) pos][(int) cnt][(int) tight];

        long ans = 0;
        BigInteger limit = (tight!=0 ? BigInteger.valueOf(9) : num.get((int) pos));

        for (int dig = 0; dig<= limit.intValue(); dig++) {
            long currCnt = cnt;
            if (dig != 0)
                currCnt++;
            long currTight = tight;
            if (dig < num.get((int) pos))
                currTight = 1;
            ans += ((countInRangeUtil(pos + 1, currCnt, currTight))%mod)%mod;
        }
        return dp[(int) pos][(int) cnt][(int) tight] = ans;
    }
    static long countInRange(BigInteger x)
    {
        num= new Vector<BigInteger>();
        while (!x.equals(BigInteger.ZERO)) {
            num.add(x.mod(BigInteger.valueOf(10)));
            x = x.divide(BigInteger.valueOf(10));
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
        BigInteger L = new BigInteger(String.valueOf(s.nextBigInteger()));
        BigInteger R = new BigInteger(String.valueOf(s.nextBigInteger()));
        L.add(BigInteger.ONE);
        K = s.nextInt();
        System.out.println( countInRange(R) - countInRange(L.subtract(BigInteger.ONE)));
    }
}
