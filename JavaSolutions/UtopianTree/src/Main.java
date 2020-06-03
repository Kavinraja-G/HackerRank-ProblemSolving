import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            System.out.println(function(n));
        }
    }
    public static int function(int n){
        int ht=0;
        for(int i=0;i<=n;i++){
            if(i%2==0 || i==0){
                ht+=1;
            }else{
                ht*=2;
            }
        }
        return ht;
    }
}
