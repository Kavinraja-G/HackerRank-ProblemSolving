import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k;
        long l,r,count = 0;
        l = s.nextLong();
        r = s.nextLong();
        k = s.nextInt();
        long p = (long) Math.pow(10,k-1);
        long values;
        long zeros;
        if(k>1)
        {
            values = r-(l+1) +1;
            zeros = (r-(l+1))/(p);
            count+= values-zeros;
        }
        System.out.println(count);
    }
}
