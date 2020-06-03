import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        ArrayList<Integer> b=new ArrayList<>();
        while(a.size()>0){
            b.add(a.size());
            int min= Collections.min(a);
            int count=0;
            for(int i=0;i<a.size();i++) {
                int j = a.get(i) - min;
                if(j==0)
                    count+=1;
                a.set(i, j);
            }
            for(int i=0;i<count;i++){
                a.remove(new Integer(0));
            }
        }
        for(int j:b){
            System.out.println(j);
        }

    }
}
