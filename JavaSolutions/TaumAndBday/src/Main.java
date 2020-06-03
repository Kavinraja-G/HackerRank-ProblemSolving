import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long t=s.nextLong();
        for(long i=1;i<=t;i++){
            long b=s.nextLong();
            long w=s.nextLong();
            long bc=s.nextLong();
            long wc=s.nextLong();
            long z=s.nextLong();
            System.out.println(function(b,w,bc,wc,z));
        }
    }
    public static long function(long b, long w,long bc, long wc,long z){
        long cost=0;
        if((bc+z)<wc)
        {
            cost = (b*bc) + (bc+z)*w;
        }
        else if((wc+z)<bc)
        {
            cost = b*(wc+z) + (wc*w);
        }
        else {
            cost = b*bc + w*wc;
        }
        return cost;
    }
}
