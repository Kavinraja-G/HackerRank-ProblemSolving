import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        for(int i=1;i<=q;i++){
            int n=s.nextInt();
            int k=s.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            ArrayList<Integer> b=new ArrayList<>();
            for(int j=0;j<n;j++){
                a.add(s.nextInt());
            }
            for(int j=0;j<n;j++){
                b.add(s.nextInt());
            }
            System.out.println(func(k,a,b));
        }
    }
    public static String func(int k,ArrayList<Integer> a,ArrayList<Integer> b){
        Collections.sort(a);
        Collections.sort(b);
        Collections.reverse(b);
        int count=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)+b.get(i)>=k){
                count+=1;
            }
        }
        if(count==a.size()){
            return "YES";
        }else{
            return "NO";
        }
    }
}
