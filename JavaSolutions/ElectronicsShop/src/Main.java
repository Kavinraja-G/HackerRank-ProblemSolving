import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int b = s.nextInt();
        int n = s.nextInt();
        int m = s.nextInt();
        int[] keyboards=new int[n];
        int[] drives=new int[m];
        for(int i=0;i<n;i++){
            keyboards[i]=s.nextInt();
        }
        for(int i=0;i<m;i++){
            drives[i]=s.nextInt();
        }
        System.out.println(getMoneySpent(keyboards,drives,b));
    }
    public static int getMoneySpent(int[] k,int[] d,int b){
        ArrayList<Integer> sumList=new ArrayList<>();
        for(int i=0;i<k.length;i++){
            for(int j=0;j<d.length;j++){
                int sum=0;
                sum=k[i]+d[j];
                if(sum<=b){
                    sumList.add(sum);
                }
            }
        }
        if(sumList.isEmpty()){
            return -1;
        }else{
            return Collections.max(sumList);
        }
    }
}
