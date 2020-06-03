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
        for(int i=0;i<100;i++){
            if(arr2[i]!=0){
                int g=arr2[i];
                for(int j=1;j<=g;j++){
                    System.out.printf("%d ",i);
                }
            }
        }
    }
}
