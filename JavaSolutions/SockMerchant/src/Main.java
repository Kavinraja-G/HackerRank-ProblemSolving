import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(sockMerchant(n,arr));
    }
    public static int sockMerchant(int n,int[] a){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int count=1;
            for(int j=0;j<a.length;j++){
                if(i!=j && a[i]==a[j]){
                    count++;
                }
            }
            if(!map.containsKey(a[i])){
                map.put(a[i],count);
            }else{
                continue;
            }
        }
        int countodd=0;
        int counteven=0;
        for(int i: map.values()){
            if(i%2==0){
                int count=0;
                for(int j=2;i>=j;i-=j){
                    count++;
                }
                counteven+=count;
            }else {
                int count=0;
                for(int j=2;i>1;i-=j){
                    count++;
                }
                countodd+=count;
            }
        }
        return counteven+countodd;
    }
}
