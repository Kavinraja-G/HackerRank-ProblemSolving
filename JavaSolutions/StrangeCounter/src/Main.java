import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t=s.nextLong();
        long i=3;
        long j=3;
        while(true){
            if(j>=t){
                long val=(j-t)+1;
                System.out.println(val);
                break;
            }else{
                i=i*2;
                j=j+i;
            }
        }
    }
}
