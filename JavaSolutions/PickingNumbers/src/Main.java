import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println(pickingNumbers(a));
    }
    public static int pickingNumbers(int[] a ){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int size1=1;
            for(int j=0;j<a.length;j++){
                int size=size1;
                if(i!=j && (a[i]-a[j]==0 || a[i]-a[j]==1)){
                    size++;
                    size1++;
                }
            }
            if(size1>max){
                max=size1;
            }
        }
        return max;
    }
}
