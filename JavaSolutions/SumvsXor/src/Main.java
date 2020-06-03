import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int x=0;x<=n;x++){
            int sum=n+x;
            int val=n^x;
            if(sum==val){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
