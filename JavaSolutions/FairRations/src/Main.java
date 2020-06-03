import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<(n-1);i++){
            if(a[i]%2==1){
                a[i]+=1;
                a[i+1]+=1;
                count+=2;
            }
        }
        if(a[n-1]%2==0){
            System.out.println(count);
        }else{
            System.out.println("NO");
        }
    }
}
