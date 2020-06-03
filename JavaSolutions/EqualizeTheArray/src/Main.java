import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    count+=1;
                }
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(n-max);
    }
}
