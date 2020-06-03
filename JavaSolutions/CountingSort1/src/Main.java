import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[100];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        for(int j=0;j<100;j++){
            arr2[j]=0;
        }
        for(int i:arr1){
            arr2[i]+=1;
        }
        for(int j:arr2){
            System.out.printf("%d ",j);
        }
    }
}
