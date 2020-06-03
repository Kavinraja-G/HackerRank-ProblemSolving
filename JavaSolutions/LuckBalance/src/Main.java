
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=s.nextInt();
            a[i][1]=s.nextInt();
        }
        int luck=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i][1]==1){
                arr.add(a[i][0]);
            }
            luck+=a[i][0];
        }
        if(arr.size()<=k){
            System.out.println(luck);
        }else{
            int g=arr.size()-k;
            for(int j=1;j<=g;j++){
                int b=arr.indexOf(Collections.min(arr));
                luck-=2*Collections.min(arr);
                arr.remove(b);
            }
            System.out.println(luck);
        }
    }
}
