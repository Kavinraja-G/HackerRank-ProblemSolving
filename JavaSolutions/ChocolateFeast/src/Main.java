import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            int c=s.nextInt();
            int m=s.nextInt();
            System.out.println(function(n,c,m));
        }
    }
    public static int function(int n,int c,int m){
        int choc=n/c;
        int wrapper=choc;
        while(wrapper>=m){
            int a=wrapper/m;
            choc+=a;
            int b=a-(m*a);
            wrapper+=b;
        }
        return choc;
    }
}
