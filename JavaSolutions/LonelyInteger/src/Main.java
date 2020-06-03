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
        System.out.println(func(a));
    }
    public static int func(ArrayList<Integer> a){
        Collections.sort(a);
        int i=0;
        while(a.size()!=1){
            if(a.get(i)==a.get(i+1)){
                a.remove(i+1);
                a.remove(i);
            }else{
                return a.get(i);
            }
        }
        return a.get(i);
    }
}
