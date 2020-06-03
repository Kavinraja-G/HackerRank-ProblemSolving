import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();
        int k=s.nextInt();
        System.out.println(function(i,j,k));
    }
    public static int function(int i, int j, int k){
        ArrayList<Integer> arrayList=new ArrayList<>();
        int count=0;
        for(int n=i;n<=j;n++){
            arrayList.add(n);
        }
        for(int g:arrayList){
            int res=0;
            int orig=g;
            while(g!=0){
                int x = g%10;
                res = (res*10) + x;
                g=(g/10);
            }
            int value=Math.abs(orig-res);
            if(value%k==0){
                count+=1;
            }
        }
        return count;
    }
}
