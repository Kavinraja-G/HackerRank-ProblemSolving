import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int p=scan.nextInt();
        int d=scan.nextInt();
        int m=scan.nextInt();
        int s=scan.nextInt();
        int count=1;
        int cost=p;
        if(p>s){
            count=0;
        }
        while(true) {
            if (p - d > m) {
                p -= d;
                cost += p;
                if (cost > s) {
                    break;
                }
                count += 1;
            } else {
                p = m;
                cost += p;
                if (cost > s) {
                    break;
                }
                count += 1;
            }
        }
        System.out.println(count);
    }
}
