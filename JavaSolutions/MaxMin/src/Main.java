import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        Collections.sort(a);
        int min=Integer.MAX_VALUE;
        for(int i=0;i+k-1<n;i++){
            if(a.get(i+k-1)-a.get(i)<min){
                min=a.get(i+k-1)-a.get(i);
            }
            if(min==0){
                break;
            }
        }
        System.out.println(min);
    }
}
