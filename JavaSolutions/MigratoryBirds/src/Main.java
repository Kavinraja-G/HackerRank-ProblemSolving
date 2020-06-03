import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(migratoryBirds(arr));
    }
    public static int migratoryBirds(int[] a){
        for(int i=0;i<a.length;i++)
            a[(a[i]%10)-1] = a[(a[i]%10)-1]+10;
        int max = -1,q=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]/10){
                max = a[i]/10;
                q=i+1;
            }
        }
        return q;



    }
}
