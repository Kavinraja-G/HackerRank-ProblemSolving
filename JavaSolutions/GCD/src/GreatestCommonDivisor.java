public class GreatestCommonDivisor {
    public static void main(String[] args)
    {
        System.out.println(getGCD(25,15));
        System.out.println(getGCD(12,30));
        System.out.println(getGCD(9,10));
        System.out.println(getGCD(81,153));

    }

    public static int getGCD(int first, int second) {
        int gcd=0;
        if ((first < 10) || (second < 10)) {
            return -1;
        } else {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
         return gcd;
        }
    }
}
