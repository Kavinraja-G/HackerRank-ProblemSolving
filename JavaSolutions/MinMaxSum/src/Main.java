import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Long> a=new ArrayList<>();
        for(int i=0;i<5;i++){
            a.add(s.nextLong());
        }
        long minsum=0;
        long maxsum=0;
        if(a.get(0)==a.get(1) && a.get(1)==a.get(2) && a.get(2)==a.get(3) && a.get(3)==a.get(4)){
            minsum=a.get(0)+a.get(1)+a.get(2)+a.get(3);
            maxsum=a.get(0)+a.get(1)+a.get(2)+a.get(3);
        }else{
            long maxvalue= Collections.max(a);
            long minvalue=Collections.min(a);
            for(long i:a){
                if(i!=maxvalue){
                    minsum+=i;
                }
            }
            for(long j:a){
                if(j!=minvalue){
                    maxsum+=j;
                }
            }
        }
        System.out.print(minsum);
        System.out.print(" "+maxsum);
    }
}
