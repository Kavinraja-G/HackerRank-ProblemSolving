import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int q=s.nextInt();
        for(int i=1;i<=q;i++){
            int m=s.nextInt();
            int n=s.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<n;j++){
                a.add(s.nextInt());
            }
            ArrayList<Integer> arr=func(m,a);
            for(int g:arr){
                System.out.printf("%d ",g);
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> func( int m, ArrayList<Integer> a){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a.size()-1;i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i)+a.get(j)==m){
                    arr.add(i+1);
                    arr.add(j+1);
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
