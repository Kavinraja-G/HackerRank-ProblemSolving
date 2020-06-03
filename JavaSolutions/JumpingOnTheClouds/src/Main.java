import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int count=0;
        int i=0;
        while(i+1<n || i+2<n){
            if(a[i+2]==0){
                count+=1;
                i+=2;
            }else if(a[i+1]==0){
                count+=1;
                i+=1;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
