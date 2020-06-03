import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            int k=s.nextInt();
            ArrayList<Integer> arrayList=new ArrayList<>();
            for(int j=0;j<n;j++){
                arrayList.add(s.nextInt());
            }
            System.out.println(func(k,arrayList));
        }
    }
    public static String func(int k,ArrayList<Integer> arrayList){
        int present=0;
        for(int i:arrayList){
            if(i<=0){
                present+=1;
            }
        }
        if(k<=present){
            return "NO";
        }else {
            return "YES";
        }
    }
}
