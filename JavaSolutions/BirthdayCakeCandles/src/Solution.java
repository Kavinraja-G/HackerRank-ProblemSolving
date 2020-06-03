import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(birthdayCakeCandles(arr));
    }
    public static int birthdayCakeCandles(int[] arr){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>=max){
                max=i;
            }
        }
        for(int j:arr){
            if(j==max){
                count++;
            }
        }
        return count;


    }
}
