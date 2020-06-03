import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        Collections.sort(a);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<(n-1);i++){
            int val=Math.abs(a.get(i)-a.get(i+1));
            if(val<min){
                min=val;
            }
        }
        System.out.println(min);
    }
}
