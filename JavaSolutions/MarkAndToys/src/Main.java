import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        Collections.sort(a);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=a.get(i);
            if(sum<=k){
                count+=1;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
