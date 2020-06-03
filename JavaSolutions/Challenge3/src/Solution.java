import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long[] arr = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextLong();
        }
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            long sum = 0;
            for(long j: arr){
                if (j!=arr[i]) {
                    sum+=j;
                }
            }

            if (sum > max) {
                max = sum;
            } else if (sum < min) {
                min = sum;
            } else {
                max = max;
                min = min;
            }

        }
        System.out.println(min + " " + max);
    }

}
