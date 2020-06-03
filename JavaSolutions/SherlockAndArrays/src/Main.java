import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        for(int i=1;i<=q;i++){
            int n=s.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=s.nextInt();
            }
            System.out.println(func(a));
        }
    }
    public static String func(int[] a){
        long left=0;
        long right=0;
        for(int i=1;i<a.length;i++){
            right+=a[i];
        }
        if(left==right){
            return "YES";
        }
        for(int j=1;j<a.length;j++){
            left+=a[j-1];
            right-=a[j];
            if(left==right){
                return "YES";
            }
        }
        return "NO";
    }
}
