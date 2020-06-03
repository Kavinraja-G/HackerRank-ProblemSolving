import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            System.out.println(function(n));
        }
    }
    public static int function(int n){
        ArrayList<Integer> arrayList=new ArrayList<>();
        int original=n;
        while(n>=1){
            int digit=n%10;
            arrayList.add(digit);
            n=n/10;
        }

        int count=0;
        for(int i:arrayList){
            if(i!=0 && original%i==0){
                count+=1;
            }
        }
        return count;
    }
}
