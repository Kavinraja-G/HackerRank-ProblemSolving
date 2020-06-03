import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] a1=new long[n];
        long[] a3=new long[n];
        long[] a2=new long[n];
        Long[] arr=new Long[n];
        for(int i=0;i<n;i++){
            long j=s.nextLong();
            a1[i]=j;
            a3[i]=j;
            a2[i]=j;
            arr[i]=j;
        }
        Arrays.sort(a2);
        Arrays.sort(arr, Collections.reverseOrder());
        long count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(a1[i]!=a2[i]){
                int j=findindex(a1,a2[i]);
                long swap= a1[i];
                a1[i]=a1[j];
                a1[j]=swap;
                count1+=1;
            }
            if(a3[i]!=arr[i]){
                int j=findindex(a3,arr[i]);
                long swap= a3[i];
                a3[i]=a3[j];
                a3[j]=swap;
                count2+=1;
            }
        }
        if(count1<=count2){
            System.out.println(count1);
        }else{
            System.out.println(count2);
        }
    }
    public static int findindex(long[] a,long j){
        for(int i=0;i<a.length;i++){
            if(a[i]==j){
                return i;
            }
        }
        return -1;
    }
}
