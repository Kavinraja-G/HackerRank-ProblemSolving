import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] c=new int[n+k];
        for(int i=0;i<n;i++){
            c[i]=s.nextInt();
        }
        c[n]=c[0];
        int e=100;
        int i=0;
        while(((i+k)%n) != 0)
        {
            if(c[(i+k)%n]==1)
                e-=3;
            else
                e-=1;
            i+=k;
        }
        if(((i+k)%n) == 0){
            if(c[(i+k)%n]==1)
                e-=3;
            else
                e-=1;
        }

        System.out.println(e);
    }
}
