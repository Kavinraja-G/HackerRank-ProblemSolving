import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] a=new long[n];
        Map<Long,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=s.nextLong();
            map.put(a[i],i);
        }
        Arrays.sort(a);
        long min= Long.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]<min && map.get(a[i])<map.get(a[i-1])){
                min=a[i]-a[i-1];
            }
        }
        System.out.println(min);
    }

}
