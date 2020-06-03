import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println(divisibleSumPairs(n,a,k));
    }
    public static int divisibleSumPairs(int n,int[] a,int k){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j && (a[i]+a[j])%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}

