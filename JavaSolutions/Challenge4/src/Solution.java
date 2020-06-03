import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long[] arr = new long[5];
        for (int i = 0; i <5; i++) {
            arr[i] = s.nextLong();
        }
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i <5; i++) {
            long sum = 0;
            for (int j=0;j<5;j++){
                if(i!=j){
                    sum+=arr[j];
                }
            }
            if (sum >=max) {
                max = sum;
            } else if (sum < min) {
                min = sum;
            } else {
                min=min;
                max=max;
            }

        }
        if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3] && arr[3]==arr[4]){
            long sum=arr[1]+arr[2]+arr[3]+arr[4];
            min=sum;
            max=sum;
        }
        System.out.println(min + " " + max);
    }

}
