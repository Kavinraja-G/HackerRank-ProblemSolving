import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> e=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();
        int p=a.get(0);
        for(int i:a){
            if(i<p){
                l.add(i);
            }else if(i==p){
                e.add(i);
            }else{
                r.add(i);
            }
        }
        for(int g:l){
            System.out.printf("%d ",g);
        }
        for(int g:e){
            System.out.printf("%d ",g);
        }
        for(int g:r){
            System.out.printf("%d ",g);
        }
    }
}
