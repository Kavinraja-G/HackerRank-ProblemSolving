import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int g=1;g<=t;g++){
            int i=s.nextInt();
            int j=s.nextInt();
            System.out.println(func(i,j,arr));
        }
    }
    public static int func(int i,int j,int[] arr){
        int min=Integer.MAX_VALUE;
        for(int a=i;a<=j;a++){
            if(arr[a]<min){
                min=arr[a];
            }
        }
        return min;
    }
}
