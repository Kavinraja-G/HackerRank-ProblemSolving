import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=s.nextInt();
        }
        int[] b=breakingRecords(scores);
        for(int j:b){
            System.out.print(j+" ");
        }
    }
    public static int[] breakingRecords(int[] a){
        int max=a[0];
        int min=a[0];
        int count1=0;
        int count2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                count1++;
            }else if(a[i]<min){
                min=a[i];
                count2++;
            }else{
                min=min;
                max=max;
            }
        }
        int[] b={count1,count2};
        return b;
    }
}
