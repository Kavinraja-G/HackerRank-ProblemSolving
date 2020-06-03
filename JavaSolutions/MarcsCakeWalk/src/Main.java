import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        Collections.sort(a);
        Collections.reverse(a);
        long miles=0;
        for(int j=0;j<n;j++){
            miles+=(Math.pow(2,j))*a.get(j);
        }
        System.out.println(miles);
    }
}
