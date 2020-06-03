import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println(function(a,b));
        }
    }
    public static int function(int a,int b){
        double x=Math.sqrt(a);
        double y=Math.sqrt(b);
        return (int)(Math.floor(y)-Math.ceil(x)+1);
    }
}
