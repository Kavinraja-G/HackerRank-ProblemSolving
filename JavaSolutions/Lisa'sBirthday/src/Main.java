import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int pages=1;
        int spcl=0;
        for(int i=0;i<n;i++){
            for(int x=1;x<=a[i];x++){
                if(x==pages){
                    spcl+=1;
                }
                if(x%k==0){
                    pages++;
                }
            }
            if(a[i]%k!=0){
                pages++;
            }
        }
        System.out.println(spcl);
    }
}
